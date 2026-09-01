//------------------- Compile-time (Method Overloading)----------------------//
import java.util.*;
class Calculator{
  void add(int a,int b){
   int c=a+b;
   System.out.println(a+" + "+b+" = "+c);
  }
  void add(int a,int b,int c){
    int d=a+b+c;
    System.out.println(a+" + "+b+" + "+c+" = "+d);
  }
  void add(double a,double b){
    double c=a+b;
    System.out.println(a+" + "+b+" = "+c);
  }
}
public class Main {
    public static void main(String[] args) {
      Calculator cal=new Calculator();
      cal.add(99,1);
      cal.add(30,30,40);
      cal.add(50.5,49.5);
    }
}
//---------------------- Runtime (Method Overriding)--------------------------//
class Person{
  void work(){
    System.out.println("Person is working");
  }
}
class Employee extends Person{
  @Override
  void work(){
    System.out.println("Employee is working");
  }
}
class Manager extends Employee{
  @Override
  void work(){
    System.out.println("Manager is managing the team");
  }
}
public class Main {
    public static void main(String[] args) {
        Manager mg = new Manager();
        mg.work();
    }
}
//--------------------another example---------------------------------------//
import java.util.*;
class Animal{
  void sound(){
   System.out.println("Animal makes a sound");
  }
}
class Dog extends Animal{
  @Override
  void sound(){
    System.out.println("Dog barks");
  }
}
class Cat extends Dog{
  @Override
  void sound(){
    System.out.println("Cat meows");
  }
} 
public class Main {
    public static void main(String[] args) {
      Animal a1=new Dog();
      Animal a2=new Cat();
      Animal a3=new Animal();
      a1.sound();
      a2.sound();
      a3.sound();
    }
}
