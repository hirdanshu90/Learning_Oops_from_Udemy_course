class Pen {
    String color;
    String type;

    public Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public void write() {
        System.out.println("writing something " + this.color);

    }
}

class Student{
    String name;
    int age;

    Student() {

    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    public void print_name() {
        System.out.println("Name is " + this.name);
    }
}

public class oops {
    public static void main(String args[]) {
        Pen pen1 = new Pen("Blue", "gel");
        pen1.write();

        Student s1 = new Student();
        s1.name = "Hir";
        s1.age = 14;

        Student s2 = new Student(s1);
        s2.print_name();
    }
    
}
