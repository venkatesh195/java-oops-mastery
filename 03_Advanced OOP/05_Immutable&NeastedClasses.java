//---------------------------Immutable Classes----------------------------//
final class Employee{
  private final int id;
  private final String name;
  Employee(int id,String name){
    this.id=id;
    this.name=name;
  }
  String getName() {
    return name;
  }
  int getId(){
    return id;
  }
}
class Main{
  public static void main(String[] args){
    Employee e=new Employee(123456,"venkatesh");
    System.out.println(e.getName());
    System.out.println(e.getId());
  }
}
//------------------------------Nested Classes--------------------------------//
//---------------1. Inner class — non-static class inside a class------------------//
class Outer {
  int x = 10;
  class Inner {
    void show() {
      System.out.println(x);
    }
  }
}
class Main{
  public static void main(String[] args){
  Outer outer = new Outer();
  Outer.Inner inner = outer.new Inner();
  inner.show();
  }
}
//-------------------------2. Static nested class---------------------//
class Company{
  static String CompanyName = "TCS";
  static String EmployeeName="Venkatesh";
  static class Employee{
    void show(){
      System.out.println("Company: "+CompanyName);
      System.out.println("Employee: "+EmployeeName);
    }
  }
}
class Main{
  public static void main(String[] args){
  
  Company.Employee d = new Company.Employee();
  d.show();
  }
}
//----------------------------3. Local class — class inside a method-----------//
class Calculator{
  void calculate(){
    class Addition{
      void add(){
        int a=10,b=20,c=a+b;
        System.out.println("Sum:-"+c);
      }
    }
    Addition c = new Addition();
    c.add();
  }
}
class Main{
  public static void main(String[] args){
  Calculator cal=new Calculator();
  cal.calculate();
  }
}
//------------------------4. Anonymous Class----------------------------//
interface Greeting{
  public void sayHello();
}
class Main{
  public static void main(String[] args){
    Greeting gr=new Greeting(){
      @Override
      public void sayHello(){
        System.out.println("Hello Venkatesh");
      }
    };
    gr.sayHello();
  }
}
