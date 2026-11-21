package Labprograms;

class Rectangle {
    double length;
    double width;

    void setDimensions(double l, double w) {
        length = l;
        width = w;
    }

    double calculateArea() {
        double area = length * width;
        return area;
    }

    void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}

public class Rect{
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        rect1.setDimensions(5, 15);

        Rectangle rect2 = new Rectangle();
        rect2.setDimensions(7, 12);

        System.out.println("-- Rectangle 1 Details --");
        rect1.displayDetails();

        System.out.println("-- Rectangle 2 Details --");
        rect2.displayDetails();
    }
}
