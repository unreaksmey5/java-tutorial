/*
Using the list from Exercise 1, replace the second item with
“Pizza”, remove the last item, then print the list.

 */
package ArrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add( "Durian");
        fruits.add("Orange");
        fruits.add("Cherry");
        fruits.add("Mango");

//        System.out.println(fruits);
//        System.out.print(fruits.size());
        fruits.set(1, "Pizza");
        fruits.remove("Mango");
        System.out.println(fruits);
        if(fruits.contains("Pizza")) {
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

    }
}
