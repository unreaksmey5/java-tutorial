package method_array;

public class Car {
    String brand;
    Car(String brand) {
        this.brand = brand;
    }
    void drive() {
        System.out.println("is driving");
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        car1.drive();
    }

}
