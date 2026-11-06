/*
Create a Seat class with:
- number
- passenger
- booked (true or false)

Create 10 seats in an ArrayList<Seat>.
All seats start empty (passenger = null, booked = false).

1. Book:
   Given a seat number and a passenger name:
   - If the seat number does not exist, print "Seat Not Found"
   - If the seat is already booked, print "Seat Taken"
   - If the passenger already has a seat,
     print "One Seat Per Passenger"
   - Otherwise, book the seat and print "Booked"

2. Cancel:
   Given a passenger name:
   - If the passenger has no seat, print "No Booking"
   - Otherwise, free the seat and print "Cancelled"

3. Auto Book:
   Given a passenger name and a group size n,
   find n seats next to each other that are all empty.
   If found, book them for that passenger name
   and print the first seat number.
   If not found, print "No Seats Available".

*/
package ArrayList;

import java.util.ArrayList;

public class Seat {
    int number;
    String passenger;
    boolean booked;

    Seat(int number) {
        this.number = number;
        this.passenger = null;
        this.booked = false;
    }

    static void book(ArrayList<Seat> seats, int seatNumber, String name) {
        Seat found = null;
        for (Seat s : seats) {
            if (s.number == seatNumber) {
                found = s;
            }
        }
        if (found == null) {
            System.out.println("Seat Not Found");
            return;
        }
        if (found.booked) {
            System.out.println("Seat Taken");
            return;
        }
        for (Seat s : seats) {
            if (name.equals(s.passenger)) {
                System.out.println("One Seat Per Passenger");
                return;
            }
        }

        found.passenger = name;
        found.booked = true;
        System.out.println("Booked");
    }

    static void cancel(ArrayList<Seat> seats, String name) {
        for (Seat s : seats) {
            if (name.equals(s.passenger)) {
                s.passenger = null;
                s.booked = false;
                System.out.println("Cancelled");
                return;
            }
        }
        System.out.println("No Booking");
    }

    static void autoBook(ArrayList<Seat> seats, String name, int n) {
        // last valid start index is size - n
        for (int i = 0; i <= seats.size() - n; i++) {

            boolean allFree = true;
            for (int j = i; j < i + n; j++) {
                if (seats.get(j).booked) {
                    allFree = false;
                    break;
                }
            }

            if (allFree) {
                for (int j = i; j < i + n; j++) {
                    seats.get(j).passenger = name;
                    seats.get(j).booked = true;
                }
                System.out.println(seats.get(i).number);  // first seat number
                return;
            }
        }
        System.out.println("No Seats Available");
    }

    public static void main(String[] args) {
        ArrayList<Seat> seats = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            seats.add(new Seat(i));
        }

        book(seats, 3, "Sok");      // Booked
        book(seats, 3, "Dara");     // Seat Taken
        book(seats, 5, "Sok");      // One Seat Per Passenger
        book(seats, 11, "Linda");   // Seat Not Found

        cancel(seats, "Sok");       // Cancelled
        cancel(seats, "Sok");       // No Booking
        cancel(seats, "Linda");     // No Booking
        book(seats, 3, "Dara");     // Booked

        autoBook(seats, "Team", 3); // 4   (seats 4, 5, 6)
        autoBook(seats, "Big", 6);  // No Seats Available
        autoBook(seats, "End", 3);  // 7   (seats 7, 8, 9)
    }
}