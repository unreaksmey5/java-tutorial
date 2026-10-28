//Practice: Convert 37.5 °C to Fahrenheit using F = C * 9 / 5 + 32. Print it with 1 decimal.
package vairable_dtype;

public class Practice1 {
    public static void main(String[] args) {
        double celsius  = 37.5;
        double fahrenheit = celsius  * 9/5 + 32;
        System.out.printf("Temperature is: %.1f F%n", fahrenheit);
    }
}
