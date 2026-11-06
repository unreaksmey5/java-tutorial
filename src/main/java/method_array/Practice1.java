/*
Exercise 1: Array statistics (loops + patterns)
java
int[] nums = {4, 8, 15, 16, 23, 42};

In main, using loops (no Arrays.sort), print:

Expected:

First: 4
Last: 42
Length: 6
Sum: 108
Average: 18.0
Min: 4
Max: 42
 */
package method_array;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] num = {4,8,15,16,23,42};
        int sum = 0;
        double average = 0;
        int min = num[0];
        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            average = sum / num.length;
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("First: " + num[0]);
        System.out.println("Second: " + num[5]);
        System.out.println("Length: " + num.length);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
