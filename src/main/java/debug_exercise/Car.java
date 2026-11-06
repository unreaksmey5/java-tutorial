//Exercise 4
package debug_exercise;

public class Car {
    String color;

    Car(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Car c = new Car("red");
        System.out.println(c.color);
    }
}
//error : Constructor must be match with the same Class name
