//---------------------------throw----------------------------------------------//
class AgeCal{
    static void checkAge(int age){
        if(age>=18){
            System.out.println("Eligible");
        }else{
            throw new IllegalArgumentException("Not eligible");
        }
    }
}
class Main{
    public static void main(String[] args){
        AgeCal a=new AgeCal();
        a.checkAge(20);
    }
}
//---------------------throws---------------------------------------------//
import java.util.*;
class AgeCal{
    static void divide(int a, int b) throws ArithmeticException{
        System.out.println(a/b);
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        AgeCal a1=new AgeCal();
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            a1.divide(a,b);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
//---------------------or--------------------------------------------//
import java.util.*;
class AgeCal{
    static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println(a / b);
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        AgeCal a1=new AgeCal();
        int a=sc.nextInt();
        int b=sc.nextInt();
        a1.divide(a,b);
    }
}
//--------------------Exception Propagation---------------------------//
class Student{
    static void methode3(){
        int x=10/0;
    }
    static void methode2(){

        methode3();
    }
    static void methode1(){
        try {
            methode2();
        } catch(ArithmeticException e) {
            System.out.println("Error occurred");
        }
        
    }
}
class Main{
    public static void main(String[] args){
        Student.methode1();
    }
}
//------------------------------Custom Exceptions--------------------------//
class InvalidAgeException extends Exception{
    InvalidAgeException(String message) {
        super(message);
    }
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Eligible");
    }
}
class Main{
    public static void main(String[] args){
        try{
            InvalidAgeException.checkAge(20);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
//--------------------------Try-with-resources------------------------------//
import java.util.*;
class Main{
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
//---------------------------Multiple Catch Blocks-------------------//
import java.util.*;
class Main{
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)) {
            int a = sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }
}
