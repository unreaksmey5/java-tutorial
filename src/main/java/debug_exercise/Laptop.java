package debug_exercise;

public class Laptop {
    String brand;

    Laptop(String brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {
        Laptop l = new Laptop("MSI");
        System.out.println(l.brand);
    }
}
//Error because of not Assign the argument value to the parameter
