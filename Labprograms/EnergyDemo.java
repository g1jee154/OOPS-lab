package Labprograms;
abstract class EnergySource {
    int sourceId;
    String sourceName;
    double energyGenerated;

    EnergySource(int id, String name, double energy) {
        sourceId = id;
        sourceName = name;
        energyGenerated = energy;
    }

    abstract double calculateEfficiency();

    void displayDetails() {
        System.out.println("Source ID: " + sourceId);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Efficiency: " + calculateEfficiency() + "%");
    }
}

class SolarEnergy extends EnergySource {
    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    @Override
    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}

class WindEnergy extends EnergySource {
    WindEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    @Override
    double calculateEfficiency() {
        return (energyGenerated / 8000) * 100;
    }
}

public class EnergyDemo {
    public static void main(String[] args) {
        EnergySource solar = new SolarEnergy(101, "Solar Panel", 4000);
        System.out.println("Solar Energy Details");
        solar.displayDetails();

        System.out.println();

        EnergySource wind = new WindEnergy(102, "Wind Turbine", 6000);
        System.out.println("Wind Energy Details");
        wind.displayDetails();
    }
}
