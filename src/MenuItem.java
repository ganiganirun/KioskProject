public class MenuItem {
    // 속성
    String buger;
    long price;
    String explan;

    // 생성자
    public MenuItem(String buger, long price, String explan){
        this.buger = buger;
        this.price = price;
        this.explan = explan;
    }

    // 기능
    public String getBuger(){
        return buger;
    }

    public long getPrice(){
        return price;
    }

    public String getExplan(){
        return explan;
    }

}
