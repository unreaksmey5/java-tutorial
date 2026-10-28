/*
Day names: use an arrow switch to turn 1 to 7 into day names.
Day  3
 */
package control_flow;

public class Practice3 {
    public static void main(String[] args) {
        int day =3;

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
