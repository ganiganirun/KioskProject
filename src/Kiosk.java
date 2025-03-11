import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.format;

public class Kiosk {

    private Scanner scn = new Scanner(System.in);
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
            for( Menu menuItem : mainMenuItmes){
                System.out.println(i+". " +menuItem.getCategory());
                i += 1;
            }
            System.out.println("0. 키오스크 종료\n");

            while (true) {
                try {
                    System.out.println("메뉴를 선택해 주십쇼.");
                    choicCategory = scn.nextInt();
                    scn.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("숫자만 입력해주세요.");
                    scn.nextLine();
                }
            }


            try {
                if(choicCategory == 0){
                    break;
                }else {
                    System.out.println("[ McDonald Menu ]");
                    i = 1;
                    for(MenuItem menuItem : mainMenuItmes.get(choicCategory-1).getMenuItemList()){
                        System.out.println(i + ". " + menuItem.toString());
                        i += 1;
                    }
                    System.out.println("0. 카테고리로 돌아가기\n");

                }
            }catch (Exception e){
                System.out.println("잘못 선택하셨습니다.");
            }


            while (true) {
                try {
                    System.out.println("메뉴를 선택해 주십쇼.");
                    choicMenu = scn.nextInt();
                    scn.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("숫자만 입력해주세요.");
                    scn.nextLine();
                }
            }

            System.out.println();


            try {
                if(choicMenu == 0){
                    continue;
                }else {
                    System.out.println(mainMenuItmes.get(choicCategory-1).getMenuItemList().get(choicMenu-1).getBuger().trim() + " " +  mainMenuItmes.get(choicCategory-1).getMenuItemList().get(choicMenu-1).getPrice()+"원 입니다.");
                }
            }catch (Exception e){
                System.out.println("잘못 선택하셨습니다.");
            }


            System.out.println();




        }
    }
}
