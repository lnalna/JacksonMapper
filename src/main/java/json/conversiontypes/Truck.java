package json.conversiontypes;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Truck extends Vehicle {
    @JsonIgnore
    private double payloadCapacity;

    public Truck(String make, String model, double payloadCapacity) {
        super(make, model);
        this.payloadCapacity = payloadCapacity;
    }

    public Truck() {
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                " make=" + super.getMake() +
                ", model=" + super.getModel() +
                ", payloadCapacity=" + payloadCapacity +
                '}';
    }
}
