package Labprograms;
public class LargestTernary {
    public static void main(String[] args) {

        int a = 12, b = 27, c = 18;
        int largest;
        largest = (a > b) ? ((a > c) ? a : c): ((b > c) ? b : c);
        System.out.println("Largest is: " + largest);
    }
}