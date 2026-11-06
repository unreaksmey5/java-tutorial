package debug_exercise;

import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    ArrayList<String> subjects;

    Student(String name, int age) { //remove void
        this.name = name; //add this
        if (age < 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    void addSubject(String subject) {
        subjects.add(subject);
    }

    void show() {
        System.out.println(name + " is " + age + " years old");
        System.out.println("Subjects: " + subjects);
    }
}

class Classroom {
    private int capacity;
    private int enrolled = 0;

    Classroom(int capacity) {
        this.capacity = capacity;
    }

    void enroll() {
        if (enrolled <= capacity) {
            enrolled = enrolled + 1;
        }
    }

    void show() {
        System.out.println(enrolled + " of " + capacity + " seats used");
    }
}

public class SchoolApp {
    public static void main(String[] args) {
        Student s1 = new Student("Sok", 20);
        s1.addSubject("Math");
        s1.addSubject("Java");
        s1.show();

        Student s2 = new Student("Dara", 22);
        s2.show();

        Student s3 = new Student("Lina", -5);
        s3.show();


        Classroom room = new Classroom(2);
        room.enroll();
        room.enroll();
        room.show();
    }
}
