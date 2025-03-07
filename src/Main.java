import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 실행 시 햄버거 메뉴가 표시되고, 이후 스캐너를 통해 메뉴를 선택
        // 제시된 메뉴 중 입력받은 숫자에 따라 다른 로직 실행
        // 특정 번호가 입력되면 프로그램 종료

        Scanner scn = new Scanner(System.in);
        boolean flag = true;
        int menu;

        while (flag){
            System.out.println("[ McDonald Lunch Menu]");
            System.out.println("1. Big Mac® Meal | \n100% 순 쇠고기 패티 두 장에 빅맥®만의 특별한 소스.\n" +
                    "입안에서 살살 녹는 치즈와 신선한 양상추, 양파, 그리고 피클까지.\n" +
                    "50년 넘게 전 세계인의 입맛을 사로 잡은 버거의 대명사.");
            System.out.println("2. McSpicy® Shanghai Burger Meal | \n쌀가루가 더해져 더 바삭해진 100% 닭가슴살 패티에\n" +
                    "아삭아삭한 양상추와 신선한 토마토까지!\n" +
                    "더 바삭하고 맛있어진 NEW 맥스파이시 상하이 버거로\n" +
                    "입맛도 기분도 화끈하게!");
            System.out.println("3. McCrispy™ Deluxe Burger Meal | \n100% 통닭다리살 겉바속촉 케이준 치킨 패티,\n" +
                    "촉촉한 포테이토 브리오쉬 번, 스페셜 스모키 소스가\n" +
                    "선사하는 놀랍도록 새로운 맛의 치킨 버거!");
            System.out.println("4. 1955® Burger Meal | \n113g 두툼한 순 쇠고기 패티,\n" +
                    "더 풍성해진 신선한 양상추,\n" +
                    "깊은 풍미의 그릴드 어니언까지!\n" +
                    "맥도날드가 처음 생긴 1955년의 맛을 담은\n" +
                    "영원한 오리지널 1955 버거");
            System.out.println("5. McSpicy® Shanghai Spicy Creamy Sauce Meal | \n부드러운 크림 베이스에 매콤함이 가득!\n" +
                    "쌀가루를 더해 더 바삭해진 100% 닭가슴살 패티로\n" +
                    "맛의 조화를 풍성하게 만든 투움바 치킨 버거");
            System.out.println("6. Shrimp Beef Spicy Creamy Sauce Meal | \n부드러운 크림 베이스에 깊은 매콤함이 가득!\n" +
                    "탱글한 통 새우살에 비프 패티를 더해\n" +
                    "맛의 조화를 풍성하게 만든 투움바 슈림프 버거");
            System.out.println("0. 키오스크 종료\n");


            menu = scn.nextInt();
            scn.nextLine();



        }
    }
}