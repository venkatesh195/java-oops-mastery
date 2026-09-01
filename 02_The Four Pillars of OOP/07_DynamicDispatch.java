class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void run() {
        System.out.println("Dog is running");
    }
}
class Main{
  public static void main(String[] arr){
    //Upcasting :- assigning a child object to a parent reference.
    Animal a = new Dog();
    a.sound();

    //a.run();   wrong :-Because the reference type is Animal, and Animal doesn't have run().

    //Downcasting :- converting a parent reference back to a child reference.
    Dog d = (Dog) a;
    d.sound();
    d.run();

    //instanceof :- Before downcasting, we can check the actual object
    if (a instanceof Dog) {
      Dog d2 = (Dog) a;
      d2.run();
    }
  }
}
