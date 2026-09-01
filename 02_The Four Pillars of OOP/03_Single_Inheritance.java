import java.util.*;
class Person{

  String name;
  int age;
  public void displayPerson(){
    System.out.println("==============Student detail's====================");
    System.out.println("Name :- "+name);
    System.out.println("Age :- "+age);
    
  }
}
class Student extends Person{
  String course;
  public void displayStudent(){
    
    System.out.println("Course :- "+course);
  }
}

public class Main {
    public static void main(String[] args) {
      Student st=new Student();
      st.course="B.Tech";
      st.name="John Wick";
      st.age=22;
      st.displayPerson();
      st.displayStudent();
      

    }
}
