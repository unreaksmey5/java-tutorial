/*
Sum 1 to 100: use a for loop
 */
package control_flow;

public class Practice4 {
    public static void main(String[] args) {
        int sum=0;
        for( int i = 1; i <= 100; i++ ) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
