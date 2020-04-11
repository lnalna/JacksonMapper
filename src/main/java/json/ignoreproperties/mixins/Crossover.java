package json.ignoreproperties.mixins;

public class Crossover extends Car {
    private double towingCapacity;

    public Crossover(String make, String model, int seatingCapacity, double topSpeed, double towingCapacity) {
        super(make, model, seatingCapacity, topSpeed);
        this.towingCapacity = towingCapacity;
    }

    public Crossover() {
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
