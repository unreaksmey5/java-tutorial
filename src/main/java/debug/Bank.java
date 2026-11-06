package debug;

public class Bank {
    static double addInterest(double balance, double ratePercent) {
        return balance + balance * ratePercent/100;
    }

    static double withdraw(double balance, double amount) {
        if (amount > balance) {
            return balance;
        }
        return balance - amount;
    }

    public static void main(String[] args) {
        double balance = 1000.0;
        double afterWithdraw = withdraw(balance, 200.0);
        double afterInterest = addInterest(afterWithdraw, 5.0);
        System.out.println("Final balance: " + afterInterest);
    }
}
