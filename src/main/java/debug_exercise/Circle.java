package debug_exercise;
public class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println(c.radius);
    }
}

//Constructor no return value
