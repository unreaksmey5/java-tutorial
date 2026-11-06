/*
Create an ArrayList<String> with 4 of your favorite foods. Print the list and its size.
 */
package ArrayList;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add( "Durian");
        fruits.add("Orange");
        fruits.add("Cherry");
        fruits.add("Mango");

        System.out.println(fruits);
        System.out.print(fruits.size());

    }


}
