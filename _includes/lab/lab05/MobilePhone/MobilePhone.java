public class MobilePhone {
  String brand;
  String telephonenum;
  int price;
  public MobilePhone(String brand, String telephonenum, int price) {
    this.brand = brand;
    this.telephonenum = telephonenum;
    this.price = price;
  }
  public void display() {
    System.out.printf("brand:%s\nTelePhoneNum:%s\nprice:%d\n", brand, telephonenum, price);
  }
}