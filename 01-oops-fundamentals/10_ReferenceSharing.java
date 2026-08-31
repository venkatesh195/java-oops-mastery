class Student {

    String name;
    int age;
}

public class Main {

    public static void main(String[] args) {

        Student s1 =
                new Student();

        s1.name = "Venkatesh";
        s1.age = 23;

        Student s2 = s1;

        s2.name = "Rahul";
        s2.age = 30;

        System.out.println("s1 name: " + s1.name);
        System.out.println("s1 age: " + s1.age);

        System.out.println("s2 name: " + s2.name);
        System.out.println("s2 age: " + s2.age);
    }
}
