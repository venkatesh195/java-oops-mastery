//-------------------------------interfaces Example Code------------------------------------//
interface Payment{
  public void pay();
}
class CreditCardPayment implements Payment{
  @Override
  public void pay(){
    System.out.println("Payment using Credit Card");
  }
}
class UPIPayment implements Payment{
  @Override
  public void pay(){
    System.out.println("Payment using UPI");
  }
}
class Main{
  public static void main(String[] args){
    Payment p1=new CreditCardPayment();
    Payment p2=new UPIPayment();
    p1.pay();
    p2.pay();
  }
}
//---------------------------Interface Concept: Multiple Interfaces--------------------------//
interface Camera {
    void takePhoto();
}
interface GPS {
    void location();
}
class Smartphone implements Camera, GPS{
  @Override
  public void takePhoto(){
    System.out.println("Taking photo");
  }
  @Override
  public void location(){
    System.out.println("Showing location");
  }
}
class Main{
  public static void main(String[] args){
    Smartphone s1=new Smartphone();
    
    s1.takePhoto();
    s1.location();

  }
}
//--------------------------------Default Methods in Interfaces-----------------------------//
interface Vehicle {
  void start();
  default void stop(){
    System.out.println("Vehicle stopped");
  }
}
class Car implements Vehicle{
  @Override
  public void start(){
    System.out.println("Car started");
  }
}
class Bike implements Vehicle{
  @Override
  public void start(){
    System.out.println("Bike started");
  }
}
class Main{
  public static void main(String[] args){
    Vehicle v1 =new Car();
    Vehicle v2 =new Bike();
    v1.start();
    v1.stop();
    v2.start();
    v2.stop();

  }
}
//--------------------------------Static Methods in Interfaces-------------------------//
interface Payment {
  void pay();
  default void receipt() {
    System.out.println("Receipt generated");
  }
  static void info() {
    System.out.println("Payment service");
  }
}
class UPI implements Payment{
  @Override
  public void pay(){
    System.out.println("UPI payment successful");
  }
}
class Main{
  public static void main(String[] args){
    Payment v1 =new UPI();
    
    v1.pay();
    v1.receipt();
    Payment.info();

  }
}
