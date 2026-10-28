/*
Average of 4 scores. Scores: 90, 85, 77, 68. Print the average with 2 decimals.
First print the wrong integer-division version, then the correct one using a cast.
 */
package vairable_dtype;

public class Practice3 {
    public static void main(String[] args) {
        int sum = 90 + 85 + 77 + 68;
        int wrongAverage = sum/ 3;
        double rightAverage = sum/3;

        System.out.println("Wrong average is:" + wrongAverage);
        System.out.printf("Right average: %.2f%n", rightAverage);
    }
}
