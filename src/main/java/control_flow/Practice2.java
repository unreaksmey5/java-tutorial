/*
Total Cost under $50 costs $5, $50 to $99 costs $2, $100 or more is free.
 */
package control_flow;

public class Practice2 {
    public static void main(String[] args) {
        double cost = 10.0;
        if (cost < 50) {
            double shipping_fee = cost + 5;
            System.out.println("Total Cost " + shipping_fee);
        }
        else if (cost >= 50 && cost <=99) {
            double shipping_fee = cost + 2;
            System.out.println("Total Cost " + shipping_fee);
        }
        else if (cost >= 100) {
            double shipping_fee = cost + 0;
            System.out.println("Total Cost " + shipping_fee);
        }

    }
}
