import java.util.*;
class Person{
  String name;
  int age;

  public void displayPerson(){
    System.out.println("==============Displaying Person detail's====================");
    System.out.println("Name :- "+name);
    System.out.println("Age :- "+age);
    
  }
}
class Employee extends Person{
  int employeeId;
  double salary;

  public void displayEmployee(){
    System.out.println("==============Displaying Employee detail's====================");
    System.out.println("employeeId :- "+employeeId);
    System.out.println("Salary :- "+salary);
  }

}
class Manager extends Employee{
  String department;

  public void displayManager(){
    System.out.println("==============Displaying Manager detail's====================");
    System.out.println("department :- "+department);
  }
}
public class Main {
    public static void main(String[] args) {
      Manager mg=new Manager();
      mg.department="Developer Team";
      mg.employeeId=12345678;
      mg.salary=5000;
      mg.name="John Wick";
      mg.age=22;
      mg.displayManager();
      mg.displayEmployee();
      mg.displayPerson();

    }
}
