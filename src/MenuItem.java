public class MenuItem {
    // 속성
    private String buger;
    private int price;
    private String explan;

    // 생성자
    public MenuItem(String buger, int price, String explan){
        this.buger = buger;
        this.price = price;
        this.explan = explan;
    }

    // 기능
    public String getBuger(){
        return buger;
    }

    public int getPrice(){
        return price;
    }

    public String getExplan(){
        return explan;
    }


}
