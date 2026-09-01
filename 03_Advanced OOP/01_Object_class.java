//--------------------------------toString()---------------------------------------//
class Student {
  String name;
  int age;
  String course;

  Student(String name, int age,String course) {
    this.name = name;
    this.age = age;
    this.course=course;
  }
  @Override
  public String toString() {
    return "Student{name='" + name + "', age=" + age + ", Course= "+course+"}";
  }
}
class Main{
  public static void main(String[] args){
    Student s1=new Student("Venkatesh",22,"Java");
    System.out.println(s1);
  }
}
//--------------------------------equals()-------------------------------------//
class Student {
  String name;
  int age;
  String course;
  //Basic structure:
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (!(obj instanceof Student)) {
        return false;
    }
    Student other = (Student) obj;
    return age == other.age && name.equals(other.name) && course.equals(other.course);
  }

  Student(String name, int age,String course) {
    this.name = name;
    this.age = age;
    this.course=course;
  }
}
class Main{
  public static void main(String[] args){
    Student s1 = new Student("Venkatesh", 22, "Java");
    Student s2 = new Student("Venkatesh", 22, "Java");

    System.out.println(s1 == s2);   //false
    System.out.println(s1.equals(s2)); //true
  }
}
----------------------------------hashCode() ---------------------------------------//
import java.util.*;
class Student {
  String name;
  int age;
  String course;
  Student(String name, int age,String course) {
    this.name = name;
    this.age = age;
    this.course=course;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (!(obj instanceof Student)) {
        return false;
    }
    Student other = (Student) obj;
    return age == other.age && name.equals(other.name) && course.equals(other.course);
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, age, course);
  }
}
class Main{
  public static void main(String[] args){
    Student s1 = new Student("Venkatesh", 22, "Java");
    Student s2 = new Student("Venkatesh", 22, "Java");

    System.out.println(s1.equals(s2));
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());

    HashSet<Student> set = new HashSet<>();

    set.add(s1);
    set.add(s2);

    System.out.println(set.size());


  }
}
