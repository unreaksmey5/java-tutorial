/*
Create a Student class with name and score.
Add 4 students to an ArrayList<Student>.
Print the student with the highest score, and print all students who passed (score >= 50)
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
   String name;
   int score;

   Student(String name, int score) {
       this.name = name;
       this.score = score;
   }

   public static void main(String[] args) {
       ArrayList<Student> students = new ArrayList<>();
       students.add(new Student("Dara", 60));
       students.add(new Student("Mey", 22));
       students.add(new Student("Kan", 56));
       students.add(new Student("Lang", 15));
        Student highest = students.get(0);
       for(Student s: students){
           if( s.score > highest.score) {
               highest = s;

           }

           if( s.score >= 50) {
               System.out.println(s.name + " " + s.score );
           }
       }
       System.out.println("Highest Student is : " + highest.name + " " + highest.score);
   }

}
