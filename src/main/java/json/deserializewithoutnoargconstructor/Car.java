package json.deserializewithoutnoargconstructor;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Car extends Vehicle {
    private int seatingCapacity;
    private double topSpeed;

    @JsonCreator
    public Car(
            @JsonProperty("make") String make,
             @JsonProperty("model")  String model,
             @JsonProperty("seatingCapacity")  int seatingCapacity,
             @JsonProperty("topSpeed")  double topSpeed) {
        super(make, model);
        this.seatingCapacity = seatingCapacity;
        this.topSpeed = topSpeed;
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
