package json.deserializewithoutnoargconstructor;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Truck extends Vehicle {
    private double payloadCapacity;

    @JsonCreator
    public Truck(
            @JsonProperty("make") String make,
            @JsonProperty("model") String model,
            @JsonProperty("payloadCapacity") double payloadCapacity) {
        super(make, model);
        this.payloadCapacity = payloadCapacity;
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
