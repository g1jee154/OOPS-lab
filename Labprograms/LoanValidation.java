package Labprograms;

import java.util.Scanner;

class LoanException extends Exception {

    LoanException(String msg) {
        super(msg);
    }
}

public class LoanValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Monthly Salary: Rs. ");

            double salary = sc.nextDouble();

            if (Double.isNaN(salary) || Double.isInfinite(salary)
                    || salary < 0) {

                throw new LoanException("Invalid Salary!");
            }

            if (salary < 15000) {

                throw new LoanException("Loan Application Rejected!");
            }

            System.out.println("Loan Application Approved!");
        }

        catch (LoanException e) {

            System.out.println(e.getMessage());

            if (!"Invalid Salary!".equals(e.getMessage())) {

                System.out.println(
                        "Minimum Salary Required is Rs. 15000");
            }
        }

        catch (java.util.InputMismatchException e) {

            System.out.println(
                    "Incorrect Input! Enter a numeric salary.");
        }

        finally {
            sc.close();
        }
    }
}
