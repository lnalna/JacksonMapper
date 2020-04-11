package json.defaulttyping;

/*
https://www.baeldung.com/jackson-inheritance
 */

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

public class MainClass {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping();

        Car car = new Car("Mercedes-Benz", "S500", 5, 250.0);
        Truck truck = new Truck("Isuzu", "NQR", 7500.0);

        List<Vehicle> vehicles = new ArrayList();
        vehicles.add(car);
        vehicles.add(truck);

        Fleet serializedFleet = new Fleet();
        serializedFleet.setVehicles(vehicles);

        String jsonDataString = mapper.writeValueAsString(serializedFleet);
        System.out.println("After Serialization:");
        System.out.println(jsonDataString);

        Fleet deserializedFleet = mapper.readValue(jsonDataString, Fleet.class);
        System.out.println("\n\n After Deserialization:");
        System.out.println(deserializedFleet);

        assertThat(deserializedFleet.getVehicles().get(0), instanceOf(Car.class));
        assertThat(deserializedFleet.getVehicles().get(1), instanceOf(Truck.class));
    }

}
