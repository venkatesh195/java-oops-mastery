class Student {
    String name;
    int age;
    String course;
    float marks;
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Venkatesh";
        s1.age = 23;
        s1.course = "B.Tech";
        s1.marks = 99.9f;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.course);
        System.out.println(s1.marks);
    }
}
