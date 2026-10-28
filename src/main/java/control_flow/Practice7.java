/*
Times table: use for to print 5 x 1 = 5 up to 5 x 10 = 50
 */
package control_flow;

public class Practice7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int time_table = 5 * i;
            System.out.println("5 x " + i + " = " + time_table);
        }

    }
}