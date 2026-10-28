/*
Challenge: print every number from 1 to 50 divisible by  3, using continue to skip the others.
 */
package control_flow;

public class Practice5 {
    public static void main(String[] args) {
        for( int i=1; i<=50; i++){
            if(i % 3 !=0){
                continue;
        }
            System.out.println(i);
        }
    }
}
