package Labprograms;
import java.util.Scanner;

public class EmailOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email Address: ");
        String email = sc.nextLine();

        email = email.toLowerCase();

        System.out.println("Lowercase Email: " + email);

        System.out.println("Length: " + email.length());

        int pos = email.indexOf('@');

        String username = email.substring(0, pos);

        System.out.println("Username: " + username);

        String domain = email.substring(pos + 1);

        System.out.println("Domain: " + domain);

        if (domain.equals("bmsce.ac.in")) {
            System.out.println("Belongs to BMSCE");
        } else {
            System.out.println("Does not belong to BMSCE");
        }

        System.out.print("Enter Prefix: ");
        String prefix = sc.nextLine();

        if (email.startsWith(prefix)) {
            System.out.println("Email starts with given prefix");
        } else {
            System.out.println("Email does not start with given prefix");
        }

        if (email.endsWith("bmsce.ac.in")) {
            System.out.println("Email ends with valid domain");
        } else {
            System.out.println("Email does not end with valid domain");
        }

        String updated = email.replace(
                "bmsce.ac.in", "cse.bmsce.ac.in");

        System.out.println("Updated Email: " + updated);

        System.out.print("Enter sequence to search: ");
        String search = sc.nextLine();

        if (email.contains(search)) {
            System.out.println("Email contains given sequence");
        } else {
            System.out.println("Email does not contain given sequence");
        }

        String trimmed = email.trim();

        System.out.println("Trimmed Email: " + trimmed);

        System.out.print("Enter another email: ");
        String email2 = sc.nextLine();

        if (email.equalsIgnoreCase(email2)) {
            System.out.println("Both email addresses are identical");
        } else {
            System.out.println("Both email addresses are different");
        }

        sc.close();
    }
}