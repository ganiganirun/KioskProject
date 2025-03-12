import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String category;
    private List<MenuItem> menuItemList;

    public Menu(String category) {
        this.category = category;
        menuItemList = new ArrayList<>();
        addmenu();
    }

    private void addmenu(){
        switch (category){
            case "Burger" -> {
                menuItemList.add(new MenuItem("Big Mac Meal", 7200, "참깨빵위에 순쇠고기 패티 두장 특별한 소스 양상추 치즈 피클 양파까지~"));
                menuItemList.add(new MenuItem("Shanghai Burger Meal", 7100, "쌀가루가 더해져 더 바삭해진 100% 닭가슴살 패티가 들어간 버거"));
                menuItemList.add(new MenuItem("Deluxe Burger Meal", 7900, "100% 통닭다리살 겉바속촉 케이준 치킨 패티에 브리오쉬 번을 사용한 버거"));
                menuItemList.add(new MenuItem("1955 Burger Meal", 7800, "10 : 1 패티와 그릴드 어니언까지 맥도날드가 처음 생긴 1955년의 맛을 담은 버거"));
                menuItemList.add(new MenuItem("Bulgogi Burger Meal", 5300, "한국인의 입맛에 딱 맞는 불고기 소스에 잘 재운 패티와 고소한 마요네즈, 신선한 양상추의 맛있는 조합."));

            }
            case "Side" -> {
                menuItemList.add(new MenuItem("Shrimp Snack Wrap", 6300, "통통한 새우살 가득한 슈림프 패티에 화이트마요와 스위트 칠리 소스로 매콤달콤하게!"));
                menuItemList.add(new MenuItem("Chicken Snack Wrap", 6300, "매콤한 치킨에 달콤한 화이트 마요 소스로 매콤달콤하게!"));
                menuItemList.add(new MenuItem("French Fries", 7500, "통으로 썰어낸 감자를 맥도날드만의 노하우로 튀겨낸 남다른 맛과 바삭함!"));
                menuItemList.add(new MenuItem("Coleslaw", 7000, "양배추, 당근, 양파가 상큼하고 크리미한 마요 드레싱과 어우러져 아삭하게 씹히는 샐러드"));
                menuItemList.add(new MenuItem("Chicken Tenders", 8200, "부드러운 100% 닭안심살을 스파이시 시즈닝으로 매콤 바삭하게 튀겨낸 치킨 텐더!"));
                menuItemList.add(new MenuItem("McNuggets", 8600, "바삭하고 촉촉한 치킨이 한 입에 쏙! 다양한 소스로 입맛에 맞게 즐겨보세요! 4조각"));
                menuItemList.add(new MenuItem("Cheese Sticks", 8600, "속이 꽉 찬 황금빛 바삭함! 자연 모짜렐라 치즈로 빈틈 없이 고소한 치즈스틱 2조각"));

            }
            case "Dessert" -> {
                menuItemList.add(new MenuItem("Choco Churros", 6300, "바삭한 초코 츄러스에 가득 찬 진한 초코 필링!"));
                menuItemList.add(new MenuItem("Oreo McFlurry", 6300, "우유 듬뿍 신선한 아이스크림에 아삭아삭 오레오 쿠키가 가득!"));
                menuItemList.add(new MenuItem("Choco Oreo McFlurry", 7000, "초콜릿 퍼지와 오레오 쿠키까지! 달달함이 두 배로!"));
                menuItemList.add(new MenuItem("Vanilla Sundae", 8200, "신선한 우유로 만든 부드럽고 달콤한 아이스크림"));
                menuItemList.add(new MenuItem("Chocolate Sundae", 8600, "신선한 우유로 만든 아이스크림에 달콤한 초콜렛 시럽이 입안 가득."));
                menuItemList.add(new MenuItem("Strawberry Sundae", 8600, "신선한 우유와 딸기가 아이스크림으로 만났다!"));
                menuItemList.add(new MenuItem("Ice Cream Cone", 8600, "신선한 우유로 만든 부드러운 아이스크림 콘."));
            }
            case "Orders" -> menuItemList = new ArrayList<>();
            case "Cancel" -> menuItemList = new ArrayList<>();
            default -> System.out.println("카테고리 내에서만 골라주세요");
        }
    }

    public void removeOrder (){
        menuItemList.clear();
    }

    public void addOrder (MenuItem menuItems){
        menuItemList.add(menuItems);
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public String getCategory(){
        return category;
    }




}
