package Labprograms;

import java.util.Scanner;

class AttendanceException extends Exception {

    AttendanceException(String msg) {
        super(msg);
    }
}

public class AttendanceValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Student Attendance Percentage: ");

            double attendance = sc.nextDouble();

            if (Double.isNaN(attendance) || Double.isInfinite(attendance)
                    || attendance < 0 || attendance > 100) {

                throw new AttendanceException(
                        "Invalid Attendance Percentage!");
            }

            if (attendance < 75) {

                throw new AttendanceException(
                        "Insufficient Attendance!");
            }

            System.out.println(
                    "Student is eligible for examination.");
        }

        catch (AttendanceException e) {

            System.out.println(e.getMessage());
        }

        catch (java.util.InputMismatchException e) {

            System.out.println(
                    "Incorrect Input! Enter a numeric percentage.");
        }

        finally {
            sc.close();
        }
    }
}
