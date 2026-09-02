//-----------------------1. Inheritance — "IS-A"-----------------------//
//Inheritance means one class is a type of another class.//
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
}
//------------------------------Composition — "HAS-A"---------------------------//
//Composition means one class contains/owns another object.//
class Engine {
}

class Car {
    Engine engine = new Engine();
}
//------------------------------------code--------------------------------//
class Engine{
  void start(){
    System.out.println("Engine started");
  }
}
class Car{
  Engine engine = new Engine();
  void drive(){
    engine.start();
    System.out.println("Car is driving");
  }
}
class Main{
  public static void main(String[] args){
    Car c = new Car();
    c.drive();
    
  }
}
