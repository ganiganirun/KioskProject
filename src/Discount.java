public enum Discount {
  APONM("국가유공자", 0.1),
  SOLDIER("군인", 0.05),
  STUDENT("학생", 0.03),
  GENERAL("일반", 0);

  private final String name;
  private final double discount;

  Discount(String name, double discount) {
    this.name = name;
    this.discount = discount;
  }

}
