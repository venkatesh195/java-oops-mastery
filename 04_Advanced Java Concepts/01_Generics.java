//Generics are used to make Java code type-safe, reusable, and flexible.//
//-----------------------Without Generics-----------------------------------//
import java.util.*;

class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(10);
        list.add("Venkatesh");

        String name = (String) list.get(1);

        System.out.println(name);
    }
}
//------------------------------With Generics----------------------------------//
import java.util.*;

class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Venkatesh");
        names.add("Rahul");

        String name = names.get(0);

        System.out.println(name);
    }
}
//--------------------------Generic Class------------------------------------//
class Box<T>{
  T value;
  Box(T value){
    this.value = value;
  }
  void show(){
    System.out.println(value);
  }
}
class Main{
  public static void main(String[] args) {
    Box<Integer> b1 = new Box<>(100);
    Box<String> b2 = new Box<>("Java");

    b1.show();
    b2.show();
  }
}
//----------------------------Generic Method------------------------------//
class Main {
  static <T> void display(T data) {
    System.out.println(data);
  }
  public static void main(String[] args) {
    display(100);
    display("Java");
    display(59.77);
  }
}
//---------------------Generic Method with array-----------------------//
class Main {
  static <T> void printarr(T[] arr) {
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) {
    Integer[] numbers = {10, 20, 30};
    String[] names = {"Venkatesh", "Rahul", "Kiran"};
    Double[] marks = {85.5, 90.5, 75.5};
    printarr(numbers);
    System.out.println();
    printarr(names);
    System.out.println();
    printarr(marks);
  }
}
//-----------------------Bounded Generics-------------------------//
class Main {
  static <T extends Number> void display(T value) {
    System.out.println(value);
  }
  public static void main(String[] args) {
    display(100);
    display(25.5);
  }
}
//------------------------------------------------------------------//
class Main {
  static <T extends Number> double square(T value){
    double num = value.doubleValue();
    return num * num;
  }
  public static void main(String[] args) {
    System.out.println(square(5));
    System.out.println(square(2.5));
  }
}
//----------------------Wildcards-----------------------------------//
import java.util.*;
class Main {
  static void printList(List<?> list){
    for(Object x:list){
      System.out.print(x+" ");
    }
  }
  public static void main(String[] args) {
    List<Integer> numbers=List.of(1,2,3,5,6,8);
    List<String> names=List.of("ram","sita","jnd","kinfn");
    printList(numbers);
    System.out.println();
    printList(names);
    System.out.println();

  }
}
//-----------------------------<? extends T>--------------------------//
import java.util.*;
class Main {
  static void printNumbers(List<? extends Number> list){
    for(Object x:list){
      System.out.print(x+" ");
    }
  }
  public static void main(String[] args) {
    List<Integer> numbers=List.of(1,2,3,5,6,8);
    List<Double> decimals=List.of(1.1,23.3,55.5,64.5);
    printNumbers(numbers);
    System.out.println();
    printNumbers(decimals);
    System.out.println();

  }
}
//----------------------<? super T>---------------------------------//
import java.util.*;
class Main {
  static void addNumbers(List<? super Integer> list){
    list.add(10);
    list.add(20);
    list.add(30);
  }
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    addNumbers(numbers);
    System.out.println(numbers);
  }
}
//----------------------Interface Generic----------------------------//
interface Storage<T>{
  void store(T value);
  T retrieve();

}
class DataStorage<T> implements Storage<T>{
  T value;
  @Override
  public void store(T value){
    this.value=value;
  }
  @Override
  public T retrieve(){
    return value;
  }
}
class Main{
  public static void main(String[] args){
    DataStorage<Integer> ds=new DataStorage<>();
    ds.store(100);
    DataStorage<String> ds1=new DataStorage<>();
    ds1.store("java");
    System.out.println(ds.retrieve());
    System.out.println(ds1.retrieve());
  }
}
//--------------------------------Multiple Type Parameters-----------------------------//
class DataStorage<T,K> {
  T value;
  K data;
 
  DataStorage(T value,K data){
    this.value=value;
    this.data=data;
  }
  
  public void show(){
    System.out.println("K data "+data);
    System.out.println("T data "+value);
  }
}
class Main{
  public static void main(String[] args){
    DataStorage<Integer,String> ds=new DataStorage<>(100,"venkatesh");
    ds.show();
    
  }
}
//------------------------Generic Constructor--------------------------------//
class Printer{
  <T> Printer(T data){
    System.out.println(data);
  }
}
class Main{
  public static void main(String[] args){
    Printer p=new Printer(100);
    Printer ps=new Printer("Venkatesh");
    Printer pd=new Printer(44.4);
  }
}
//------------------------Generic Method with Multiple Type Parameters---------------------------//
class Printer{
  static <A, B> void display(A first, B second){
    System.out.println("A :-"+first);
    System.out.println("B :-"+second);
  }
}
class Main{
  public static void main(String[] args){
    Printer.display(100,"venkatesh");
    Printer.display("Age",22);
    Printer.display("Marks",99.3);

  }
}
//-------------------------Type Erasure-------------------------------------//
1. List<String> list = new ArrayList<>();                    //valid

2. List<Integer> list = new ArrayList<>();                   //valid

3. T obj = new T();                                          //invalid

4. T[] arr = new T[5];                                       //invalid

5. List<?> list = new ArrayList<String>();                    //valid
