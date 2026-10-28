/*
Grade calculator: take a score and print A, B, C,D, E and F using if/else.
 */
package control_flow;

public class Practice1 {
    public static void main(String[] args) {
        double score = 100.0;

       if(score <= 100.0 && score >= 90.0){
           System.out.println("Grade A");
       }
       else if(score < 90 && score >= 70.0){
           System.out.println("Grade B");
       }
       else if(score < 70 && score >= 60.0){
           System.out.println("Grade C");
       }
       else if(score < 60 && score >= 50.0){
           System.out.println("Grade D");
       }
       else if(score < 50 && score >= 40.0){
           System.out.println("Grade E");
       }
       else if(score < 40 && score >= 0.0){
           System.out.println("Grade F");
       }
    }
}
