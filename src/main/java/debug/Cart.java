package debug;

public class Cart {
    static double applyCoupon(double price, String code) {
        if (code.equals("SAVE20")) {
            return price - price * 0.20;
        }
        return price;
    }

    static double addTax(double price) {
        return price + price * 0.10;
    }

    public static void main(String[] args) {
        double price = 50.0;
        double afterCoupon = applyCoupon(price, "SAVE20");
        double finalPrice = addTax(afterCoupon);
        System.out.println("You pay: " + finalPrice);
    }
}
