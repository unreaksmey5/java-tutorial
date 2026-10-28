/*
Count vowels: loop through a String and count a, e, i, o, u
 */
package control_flow;

public class Practice8 {
    public static void main(String[] args) {
        String str = "hello world";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }

}
