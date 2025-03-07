import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //MenuItem 클래스를 활용하여 햄버거 메뉴를 출력하시오
        // 객체를 생성하고 리스트에 아이템을 추가하시오.

        Scanner scn = new Scanner(System.in);
        boolean flag = true;
        int menu;

        List<MenuItem> menuItemList = new ArrayList<>();

        menuItemList.add(new MenuItem("Big Mac® Meal",6300,"참깨빵위에 순쇠고기 패티 두장 특별한 소스 양상추 치즈 피클 양파까지~"));
        menuItemList.add(new MenuItem("McSpicy® Shanghai Burger Meal",6300,"쌀가루가 더해져 더 바삭해진 100% 닭가슴살 패티가 들어간 버거"));
        menuItemList.add(new MenuItem("McCrispy™ Deluxe Burger Meal",7500,"100% 통닭다리살 겉바속촉 케이준 치킨 패티에 브리오쉬 번을 사용한 버거"));
        menuItemList.add(new MenuItem("1955® Burger Meal",7000,"10 : 1 패티와 그릴드 어니언까지 맥도날드가 처음 생긴 1955년의 맛을 담은 버거"));
        menuItemList.add(new MenuItem("McSpicy® Shanghai Spicy Creamy Sauce Meal",8200,"쌀가루가 더해져 더 바삭해진 100% 닭가슴살 패티에 부드러운 크림 베이스에 매콤함이 가득!"));
        menuItemList.add(new MenuItem("Shrimp Beef Spicy Creamy Sauce Meal",8600,"탱글한 통 새우살에 비프 패티에 부드러운 크림 베이스에 깊은 매콤함이 가득!"));


        while (flag){
            System.out.println("[ McDonald Lunch Menu]");

            System.out.println("0. 키오스크 종료\n");

            while (true) {
                try {
                    System.out.println("메뉴를 선택해 주십쇼.");
                    menu = scn.nextInt();
                    scn.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("숫자만 입력해주세요.");
                    scn.nextLine();
                }
            }

            System.out.println();

            switch (menu){
                case 0 -> flag = false;
                case 1 -> System.out.println("빅맥 런치 세트 6,300원 입니다.");
                case 2 -> System.out.println("상하이 런치 세트 6,300원 입니다.");
                case 3 -> System.out.println("맥크리스피 디럭스 런치 7,500세트 원 입니다.");
                case 4 -> System.out.println("1955 런치 세트 7,000원 입니다.");
                case 5 -> System.out.println("상하이투움바 런치 8,200세트 원 입니다.");
                case 6 -> System.out.println("슈비투움바 런치 세트 8,600원 입니다.");
                default -> System.out.println("잘못 선택하셨습니다.");

            }

            System.out.println();




        }
    }
}