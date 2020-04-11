package json.conversiontypes;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Car extends Vehicle {
    @JsonIgnore
    private int seatingCapacity;
    @JsonIgnore
    private double topSpeed;

    public Car(String make, String model, int seatingCapacity, double topSpeed) {
        super(make, model);
        this.seatingCapacity = seatingCapacity;
        this.topSpeed = topSpeed;
    }

    public Car() {
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                " make=" + super.getMake() +
                ", model=" + super.getModel() +
                ", seatingCapacity=" + seatingCapacity +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
