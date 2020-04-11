package json.conversiontypes;

/*
https://www.baeldung.com/jackson-inheritance
 */

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainClass {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        //mapper.enableDefaultTyping();

        Car car = new Car("Mercedes-Benz", "S500", 5, 250.0);
        Truck truck = mapper.convertValue(car, Truck.class);

        assertEquals("Mercedes-Benz", truck.getMake());
        assertEquals("S500", truck.getModel());
    }
}
