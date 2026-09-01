interface Payment{
  public void pay();
  default void receipt(){
    System.out.println("Receipt generated");
  }
  static void info(){
    System.out.println("Payment information is here");
  }
}
class UPIPayment implements Payment{
  @Override
  public void pay(){
    System.out.println("UPIPayment");
  }
}
class PhonePePayment extends UPIPayment{
  @Override
  public void pay(){
    System.out.println("PhonePe payment successful");
  }
}
class CardPayment implements Payment{
  @Override
  public void pay(){
    System.out.println("CardPayment");
  }
}
public class Main{
  public static void main(String[] args){
    Payment p1 = new PhonePePayment();
    Payment p2 = new CardPayment();

    p1.pay();
    p1.receipt();

    p2.pay();
    p2.receipt();

    Payment.info();
  }
}
