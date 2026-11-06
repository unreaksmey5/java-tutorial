package debug;
public class Practice1 {
    public static void main(String[] args) {
        int[] scores = {80, 90, 70, 60, 50};
        int sum = 0;
        for (int i = 0; i <= scores.length; i++) {
            sum = sum + scores[i];
        }
        System.out.println("Sum: " + sum);
    }
}
