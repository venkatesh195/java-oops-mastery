//-------------------------------------Parent variable-----------------------------------//
import java.util.*;
class Person{
  String name="john Wick";

  public void displayPerson(){
    System.out.println("=======Displaying Person detail's=========");
    System.out.println("Person Name :- "+name);
    
  }
}
class Employee extends Person{
  String name="venkatesh";

  public void displayEmployee(){
    System.out.println("=======Displaying Employee detail's=========");
    System.out.println("employee name :- "+name);
    System.out.println("Person Name :- "+super.name);
  }

}
public class Main {
    public static void main(String[] args) {
      Employee mg=new Employee();
      mg.displayEmployee();
    }
}
/--------------------------------Parent method-----------------------------------//
import java.util.*;
class Person{
  public void display(){
    System.out.println("Person ");
    
  }
}
class Employee extends Person{

  public void display(){
    System.out.println("employee ");
  }
  public void ShowBoth(){
    display();
    super.display();
  }

}
public class Main {
    public static void main(String[] args) {
      Employee mg=new Employee();
      mg.ShowBoth();
    }
}
//----------------------Parent constructor --------------------------------//
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {
    int employeeId;
    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }
    void display() {
        System.out.println("Name :- " + name);
        System.out.println("Age :- " + age);
        System.out.println("Employee Id :- " + employeeId);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee mg = new Employee("Venkatesh", 23, 101);
        mg.display();
    }
}
//---------------------this keyword------------------------------------------//
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {
    int employeeId;
    double salary;
    Employee(String name, int age, int employeeId,double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary=salary;
    }
}
class Manager extends Employee{
  String department;
  Manager(String name, int age, int employeeId,double salary,String department){
    super(name, age,  employeeId, salary);
    this.department=department;
  }
  void display(){
    System.out.println("Name:- "+name);
    System.out.println("Age:- "+age);
    System.out.println("Employee Id:- "+employeeId);
    System.out.println("Salary:- "+salary);
    System.out.println("Department:- "+department);
  }
}
public class Main {
    public static void main(String[] args) {
        Manager mg = new Manager("Venkatesh", 23, 101,5000,"HR Team");
        mg.display();
    }
}
