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
    private List<Menu> mainMenuItmes = new ArrayList<>();

    public Kiosk(){
        addCategory();
    }

    private void addCategory(){
        mainMenuItmes.add(new Menu("Burger"));
        mainMenuItmes.add(new Menu("Side"));
        mainMenuItmes.add(new Menu("Dessert"));
    }

    public void start(){

        while (flag){

            System.out.println("[ McDonald Menu]");

            int i = 1;
            for( Menu menu : mainMenuItmes){
                System.out.println(i+". " +menu.getCategory());
                i += 1;
            }
            System.out.println("0. 키오스크 종료\n");

            choicCategory = inputManager();

            List<MenuItem> menuItem =  mainMenuItmes.get(choicCategory-1).getMenuItemList();

            try {
                if(choicCategory == 0){
                    scn.close();
                    break;
                }else {
                    System.out.println("[ McDonald Menu ]");
                    i = 1;
                    for(MenuItem menu : menuItem){
                        System.out.println(i + ". " + menu.toString());
                        i += 1;
                    }
                    System.out.println("0. 카테고리로 돌아가기\n");
                }
            }catch (IndexOutOfBoundsException e){
                System.out.println("잘못 선택하셨습니다.");
            }

            choicMenu = inputManager();

            System.out.println();

            try {
                if(choicMenu == 0){
                    continue;
                }else {
                    System.out.println( "선택한 메뉴 -> " + menuItem.get(choicMenu-1).toString());
                }
            }catch (IndexOutOfBoundsException e){
                System.out.println("잘못 선택하셨습니다.");
            }

            System.out.println();
        }
    }

    private static int inputManager(){
        int choic;
        while (true) {
            try {
                System.out.println("메뉴를 선택해 주십쇼.");
                choic= scn.nextInt();
                scn.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력해주세요.");
                scn.nextLine();
            }
        }

        return choic;
    }
}
