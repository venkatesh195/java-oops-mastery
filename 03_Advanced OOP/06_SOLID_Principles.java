//----------------------1. Single Responsibility Principle (SRP)-----------------//
class Student {
  void study() {
    System.out.println("Student is studying");
  }
}
class StudentRepository{
  void saveToDatabase() {
    System.out.println("Student saved");
  }
}
class StudentReport{
  void generateReport() {
    System.out.println("Report generated");
  }
}

class Main{
  public static void main(String[] args){
    Student s=new Student();
    StudentRepository sp=new StudentRepository();
    StudentReport sr=new StudentReport();

    s.study();
    sp.saveToDatabase();
    sr.generateReport();
  }
}
//--------------------------------2. Open/Closed Principle (OCP)--------------------//
interface Payment {
    void pay();
}
class UPI implements Payment {
  public void pay() {
    System.out.println("Paying using UPI");
  }
}
class Card implements Payment {
  public void pay() {
    System.out.println("Paying using Card");
  }
}
class NetBanking implements Payment {
  public void pay() {
    System.out.println("Paying using Net Banking");
  }
}
class Main{
  public static void main(String[] args){
    Payment p=new UPI();
    p.pay();
    Payment p1=new Card();
    p1.pay();
    Payment p2=new NetBanking();
    p2.pay();
  }
}
//----------------------------3. Liskov Substitution Principle (LSP)---------------------//
class Bird{
  void eat(){
    System.out.println("Eating");
  }
}
class Sparrow extends Bird{
  @Override
  void eat(){
    System.out.println("Eating");
  } 
}
class Penguin extends Bird{
  @Override
  void eat(){
    System.out.println("Eating");
  } 
}
class Main{
  public static void main(String[] args){
    Bird b1 = new Sparrow();
    Bird b2 = new Penguin();

    b1.eat();
    b2.eat();
  }
}
//------------------I — Interface Segregation Principle (ISP)----------------------//
interface Printable {

    void print();
}

interface Scannable {

    void scan();
}

class Printer implements Printable {

    @Override
    public void print() {
        System.out.println("Printing document");
    }
}

class MultiFunctionPrinter implements Printable, Scannable {

    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document");
    }
}

class Main {

    public static void main(String[] args) {

        Printer p = new Printer();
        p.print();

        MultiFunctionPrinter m = new MultiFunctionPrinter();
        m.print();
        m.scan();
    }
}
//---------------------------5. Dependency Inversion Principle (DIP)-----------------------//
interface Notification {
    void send();
}
class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Email notification sent");
    }
}
class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("SMS notification sent");
    }
}
class NotificationService {
    private Notification notification;
    NotificationService(Notification notification) {
        this.notification = notification;
    }
    void sendNotification() {
        notification.send();
    }
}
class Main {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        NotificationService service =new NotificationService(email);
        service.sendNotification();
        Notification sms = new SMSNotification();
        NotificationService service2 = new NotificationService(sms);
        service2.sendNotification();
    }
}
