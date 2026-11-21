package Labprograms;

class Box {
    double width, height, depth;

    // Default constructor
    Box() {
        width = height = depth = 1.0;
    }

    // Constructor with one parameter
    Box(double side) {
        width = height = depth = side;
    }

    // Constructor with three parameters
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double getVolume() {
        double volume = width * height * depth;
        return volume;
    }
}

public class Main {
    public static void main(String[] args) {

        Box p1 = new Box();
        Box p2 = new Box(5);
        Box p3 = new Box(2, 3, 7);

        System.out.println("Volume of P1 is: " + p1.getVolume());
        System.out.println("Volume of P2 is: " + p2.getVolume());
        System.out.println("Volume of P3 is: " + p3.getVolume());
    }
}
