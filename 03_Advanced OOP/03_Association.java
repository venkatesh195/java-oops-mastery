//--------------------------------Association----------------------------//
//Association means a relationship between two independent objects.//
import java.util.*;
class Doctor{
  String name;
  Doctor(String name){
    this.name=name;
    
  }
}
class Patient{
 String name;
 Doctor doctor;
 Patient(String name,Doctor doctor){
  this.name=name;
  this.doctor=doctor;
  
 } 
}
class Main{
  public static void main(String[] args){
    Doctor d=new Doctor("Dr.Venkatesh");
    Patient p=new Patient("Ram",d);
    System.out.println("Patient: " + p.name);
    System.out.println("Doctor: " + p.doctor.name);
  }
}
//-------------------------------Aggregation-----------------------------------//
//Aggregation is a special type of Association representing a "has-a" relationship.//
import java.util.*;
class Employee{
  String name;
  Employee(String name){
    this.name=name;
    
  }
}
class Company{
 String companyName;
 Employee employee;
 Company(String companyName,Employee employee){
  this.companyName=companyName;
  this.employee=employee;
  
 } 
}
class Main{
  public static void main(String[] args){
    Employee e=new Employee("Venkatesh");
    Company c=new Company("TCS",e);
    System.out.println("Company: " + c.companyName);
    System.out.println("Employee: " + c.employee.name);
  }
}
//----------------------------Composition-------------------------------//
//Composition is also a "has-a" relationship, but it is stronger than Aggregation.//
class Engine {
    String name;
    Engine(String name) {
        this.name = name;
    }
}
class Car {
    String model;
    Engine engine;
    Car(String model, String engineName) {
        this.model = model;
        this.engine = new Engine(engineName);
    }
    void show() {
        System.out.println("Car: " + model);
        System.out.println("Engine: " + engine.name);
    }
}
class Main {
    public static void main(String[] args) {
        Car c = new Car("BMW", "Petrol");
        c.show();
    }
}
