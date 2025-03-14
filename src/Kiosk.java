import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

  public static Scanner scn = new Scanner(System.in);
  private boolean flag = true;
  private int choicCategory;
  private int choicMenu;
  private int choicOrders;
  private int totalPrice;
  private final List<Menu> mainMenuItems;

  public Kiosk() {
    mainMenuItems = new ArrayList<>();
    addCategory();
  }

  private void addCategory() {
    mainMenuItems.add(new Menu("Burger"));
    mainMenuItems.add(new Menu("Side"));
    mainMenuItems.add(new Menu("Dessert"));
    mainMenuItems.add(new Menu("Orders"));
    mainMenuItems.add(new Menu("Cancel"));
  }

  public void start() {

    while (flag) {

      System.out.println("[ McDonald Menu ]");

      int i = 1;
      for (Menu menu : mainMenuItems) {
        if (menu.getCategory().equals("Orders") && menu.getMenuItemList().isEmpty()) {
          break;
        } else {
          System.out.println(i + ". " + menu.getCategory());
          i++;
        }
      }

      System.out.println("0. 키오스크 종료\n");

      choicCategory = inputManager(mainMenuItems.size());

      if (choicCategory == 0) {
        scn.close();
        break;
      }

      List<MenuItem> menuItem = mainMenuItems.get(choicCategory - 1).getMenuItemList();

      if (choicCategory == 4) {
        System.out.println("[ Order Menu ]");

        printMenuItemList(menuItem);
        System.out.println();

        System.out.println("[ Total ]\n" + totalPrice + "원\n");

        System.out.println("1. 주문\t2. 메뉴판");
        int buy = inputManager(2);

        if (buy == 1) {
          System.out.println("\n주문이 완료되었습니다. 금액은 " + totalPrice + "원 입니다.\n");
          mainMenuItems.get(choicCategory - 1).removeOrder();
          totalPrice = 0;
        }

        continue;
      } else if (choicCategory == 5) {
        mainMenuItems.get(3).removeOrder();
        totalPrice = 0;
        continue;
      } else {
        System.out.println("\n[ McDonald Menu ]");

        printMenuItemList(menuItem);

        System.out.println("0. 카테고리로 돌아가기\n");
      }
      choicMenu = inputManager(menuItem.size());

      System.out.println();

      if (choicMenu == 0) {
        continue;
      } else {
        System.out.println("선택한 메뉴 -> " + menuItem.get(choicMenu - 1).toString() + "\n");

        System.out.println("위 메뉴를 장바구니에 추가하겠습니까?\n1.확인\t2.취소\n");
        choicOrders = inputManager(2);

        if (choicOrders == 1) {
          mainMenuItems.get(3).addOrder(menuItem.get(choicMenu - 1));
          totalPrice += menuItem.get(choicMenu - 1).getPrice();

        }
      }
      System.out.println();

    }
  }

  public static int inputManager(int size) {
    int choic;
    while (true) {
      try {
        System.out.println("메뉴를 선택해 주십쇼.");
        choic = scn.nextInt();
        scn.nextLine();
        if (choic > size) {
          throw new IndexOutOfBoundsException();
        }
        break;
      } catch (InputMismatchException e) {
        System.out.println("숫자만 입력해주세요.\n");
        scn.nextLine();
      } catch (IndexOutOfBoundsException e) {
        System.out.println("잘못 선택하셨습니다.\n");
      }
    }
    return choic;
  }

  public static void printMenuItemList(List<MenuItem> menuItem) {
    int i = 1;
    for (MenuItem menu : menuItem) {
      System.out.println(i + ". " + menu.toString());
      i += 1;
    }

  }
}
