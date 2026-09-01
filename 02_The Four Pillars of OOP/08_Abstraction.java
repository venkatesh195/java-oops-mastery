//----------------------------Abstraction----------------------------------//
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
  @Override
  void sound(){
    System.out.println("Cat meows");
  }
}
class Main{
  public static void main(String[] args){
    Animal a=new Dog();
    Animal b=new Cat();
    a.sound();
    b.sound();
  }
}
//----------------------------Normal method-------------------------------//
abstract class Vehicle{
  abstract void start();
  void stop() {
    System.out.println("Vehicle stopped");
  }
}
class Car extends Vehicle{
  @Override
  void start(){
    System.out.println("Car starts with key");
  }
}
class Bike extends Vehicle{
  @Override
  void start(){
    System.out.println("Bike starts with self-start");
  }
}
class Main{
  public static void main(String[] args){
    Vehicle v1=new Car();
    Vehicle v2=new Bike();
    v1.start();
    v1.stop();

    v2.start();
    v2.stop();
  }
}
//-----------------------Abstract Class Constructor----------------------//
abstract class Vehicle {
    String brand;
    Vehicle(String brand) {
      this.brand = brand;
    }

    abstract void start();
    void display(){
      System.out.println("Brand: "+brand);
    }
}

class Car extends Vehicle {

    Car(String brand) {
        super(brand);
        System.out.println("Car constructor");
    }

    @Override
    void start() {
        System.out.println("Car starts");
    }
    
}
class Main{
  public static void main(String[] args){
    Vehicle v = new Car("Toyota");
    v.start();
    v.display();
  }
}
