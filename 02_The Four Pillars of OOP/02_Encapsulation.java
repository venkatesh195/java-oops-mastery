import java.util.*;
class Employee{

  private int id;
  private String name;
  private double salary;
  

  public void setId(int id){
    if(id>=0){
      this.id=id;
    }
  }
  public void setName(String name){
    if(name!=null && !name.trim().isEmpty()){
      this.name=name;
    }
  }
  public void setSalary(double salary){
    if(salary>=0){
      this.salary=salary;
    }
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public double getSalary(){
    return salary;
  }
  public void increaseSalary(double percentage){
    if(percentage>0){
      this.salary=this.salary+(this.salary*(percentage/100));
    }
  }

}

public class Main {
    public static void main(String[] args) {

      Employee e1=new Employee();
      e1.setId(12345678);
      e1.setName("venkatesh");
      e1.setSalary(50);

      System.out.println("Employee Id :- "+e1.getId());
      System.out.println("Employee Name :- "+e1.getName());
      System.out.println("Salary :- "+e1.getSalary());

      e1.increaseSalary(100);

      System.out.println("Salary :- " + e1.getSalary());


    }
}
