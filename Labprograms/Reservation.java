package Labprograms;
import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String message) {
        super(message);
    }
}

public class Reservation {
    private final boolean[] seats = new boolean[5];

    void reserveSeat(int seatNo) throws SeatAlreadyBookedException {
        if (seatNo < 1 || seatNo > 5) {
            throw new ArrayIndexOutOfBoundsException("Invalid Seat Number!");
        }

        if (seats[seatNo - 1]) {
            throw new SeatAlreadyBookedException("Seat Already Booked!");
        }

        seats[seatNo - 1] = true;
        System.out.println("Seat Reserved Successfully!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reservation reservation = new Reservation();

        try {
            System.out.print("Enter Seat Number (1-5): ");
            int seatNumber = scanner.nextInt();
            reservation.reserveSeat(seatNumber);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Incorrect Input! Enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction Completed.");
            scanner.close();
        }
    }
}
