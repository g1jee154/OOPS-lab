package Labprograms;
interface ParkingCharge {
    double calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    VehicleParking(String number, String type, int hours) {
        vehicleNumber = number;
        vehicleType = type;
        parkingHours = hours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {
    TwoWheeler(String number, int hours) {
        super(number, "Two Wheeler", hours);
    }

    @Override
    public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 20;
        }
        return (2 * 20) + ((parkingHours - 2) * 10);
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + calculateCharge());
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {
    FourWheeler(String number, int hours) {
        super(number, "Four Wheeler", hours);
    }

    @Override
    public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 50;
        }
        return (2 * 50) + ((parkingHours - 2) * 30);
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + calculateCharge());
    }
}

public class ParkingDemo {
    public static void main(String[] args) {
        ParkingCharge twoWheeler = new TwoWheeler("KA10A1234", 4);
        twoWheeler.displayParkingDetails();

        System.out.println();

        ParkingCharge fourWheeler = new FourWheeler("KA10B1234", 5);
        fourWheeler.displayParkingDetails();
    }
}
