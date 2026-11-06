/*
Create an ArrayList<Integer>
with the values 10, 20, 30, 40, 50. Print the sum and the average.
 */
package ArrayList;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        int sum =0;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for (int n : numbers) {
            sum +=n;
        }
        for( int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        double average = sum / numbers.size();

        System.out.println("Sum :" + sum);
        System.out.println("Average :" + average);
    }
}
