import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private static Scanner scn = new Scanner(System.in);
    private boolean flag = true;
    private int choicCategory;
    private int choicMenu;
    private List<Menu> mainMenuItmes;

    public Kiosk(){
        mainMenuItmes = new ArrayList<>();
        addCategory();
    }

    private void addCategory(){
        mainMenuItmes.add(new Menu("Burger"));
        mainMenuItmes.add(new Menu("Side"));
        mainMenuItmes.add(new Menu("Dessert"));
        mainMenuItmes.add(new Menu("Orders"));
        mainMenuItmes.add(new Menu("Cancel"));
    }

    public void start(){

        while (flag){

            System.out.println("[ McDonald Menu ]");

            int i =1;
            for(Menu menu: mainMenuItmes){
                if(menu.getCategory().equals("Orders") && menu.getMenuItemList().isEmpty()){
                    break;
                }else {
                    System.out.println(i + ". " + menu.getCategory());
                    i++;
                }
            }

            System.out.println("0. 키오스크 종료\n");

            choicCategory = inputManager(mainMenuItmes.size());

            List<MenuItem> menuItem =  mainMenuItmes.get(choicCategory-1).getMenuItemList();

            if(choicCategory == 0){
                scn.close();
                break;
            } else if (choicCategory == 4) {
                System.out.println("[ Order Menu ]");

                printMenuItemList(menuItem);
                System.out.println();

                continue;
            } else if (choicCategory == 5) {
                mainMenuItmes.get(3).removeOrder();
                continue;
            } else {
                System.out.println("[ McDonald Menu ]");

                printMenuItemList(menuItem);

                System.out.println("0. 카테고리로 돌아가기\n");
            }
            choicMenu = inputManager(menuItem.size());

            System.out.println();

            if(choicMenu == 0){
                continue;
            } else {
                System.out.println( "선택한 메뉴 -> " + menuItem.get(choicMenu-1).toString());

                mainMenuItmes.get(3).addOrder(menuItem.get(choicMenu-1));
            }

            System.out.println();

        }
    }

    public static int inputManager(int size){
        int choic;
        while (true) {
            try {
                System.out.println("메뉴를 선택해 주십쇼.");
                choic= scn.nextInt();
                scn.nextLine();
                if(choic > size) {
                    throw new IndexOutOfBoundsException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력해주세요.\n");
                scn.nextLine();
            } catch (IndexOutOfBoundsException e){
                System.out.println("잘못 선택하셨습니다.\n");
            }
        }
        return choic;
    }
    public static void printMenuItemList(List<MenuItem> menuItem){
        int i = 1;
        for(MenuItem menu : menuItem){
            System.out.println(i + ". " + menu.toString());
            i += 1;
        }
    }
}
