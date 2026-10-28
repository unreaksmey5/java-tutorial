/*
Seconds converter. Store totalSeconds = 9875. Print it as hours, minutes and seconds.
Hint: use / and % together. Expected: 2 h 44 min 35 s
 */
package vairable_dtype;

public class Practice4 {
    public static void main(String[] args) {
        int totalSeconds = 9875;

        int hours = totalSeconds/3600;
        int remainSeconds = totalSeconds%3600;

        int minutes = remainSeconds/60;
        int seconds = remainSeconds%60;

        System.out.printf("%dh%dmin%ds%n ",hours, minutes, seconds);


    }
}
