//----------------------------final variable-------------------------------//
import java.util.*;
class Employee{
  final int employeeId;
  String name;
  Employee(int employeeId, String name){
    this.employeeId=employeeId;
    this.name=name;
    System.out.println("Employee ID: "+employeeId);
    System.out.println("Name: "+name);
  }
}
class Main{
  public static void main(String[] args){
    Employee e = new Employee(101, "Venkatesh");

  }
}
//---------------------------------final Method-------------------------------//
import java.util.*;
class Vehicle{

  final void start(){
    System.out.println("Vehicle is starting");
  }
}
class Car extends Vehicle{
  //final method we can't override 
}
class Main{
  public static void main(String[] args){
    Car e = new Car();
    e.start();

  }
}
//---------------------------------------final class ---------------------------------//
import java.util.*;
final class Bank{

  void showBankName(){
    System.out.println("SBI Bank");
  }
}
//A final class cannot be inherited.
class Branch extends Bank{
  
}
class Main{
  public static void main(String[] args){
     Branch e = new  Branch();
    e.showBankName();

  }
}
//-------------------------------------finally----------------------------------------//
try {
    System.out.println("Try");
} catch (Exception e) {
    System.out.println("Catch");
} finally {
    System.out.println("Finally");
}
//------------------------------------finalize()--------------------------------------//
@Override
protected void finalize() {
    System.out.println("Object is being finalized");
}
//finalize() — Old/Deprecated Mechanism
//finalize() was a method associated with garbage collection.
//Important for modern Java: finalize() is deprecated and should not be used. Don't use it in new projects.
