package method_array;

public class Practice2 {

    static double getDiscount(double total) {
        if (total >= 200.0) return 0.10;
        if (total >= 100.0) return 0.05;
        return 0.0;
    }

    static double finalPrice(double total) {
        return total - total * getDiscount(total);
    }

    public static void main(String[] args) {
        String[] customers = {"Sok", "Dara", "Mey", "Vireak", "Sophea"};
        String[] status    = {"paid", "pending", "cancelled", "shipped", "paid"};
        double[] prices    = {20.0, 50.0, 15.0, 100.0, 40.0};
        int[] qty          = {3, 2, 4, 2, 1};

        double received = 0;

        for (int i = 0; i < customers.length; i++) {
            double total = prices[i] * qty[i];

            switch (status[i].toLowerCase()) {
                case "cancelled":
                    continue;
                case "pending":
                    System.out.printf("%-7s | pending | waiting%n", customers[i]);
                    break;
                case "paid":
                case "shipped": {
                    double payable = finalPrice(total);
                    System.out.printf("%-7s | %-7s | $%.2f%n", customers[i], status[i], payable);
                    received += payable;
                    break;
                }
                default:
                    System.out.printf("%-7s | unknown status: %s%n", customers[i], status[i]);
            }
        }

        System.out.printf("Received: $%.2f%n", received);
    }
}