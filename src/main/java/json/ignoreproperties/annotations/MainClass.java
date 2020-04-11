package json.ignoreproperties.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.CoreMatchers.not;

public class MainClass {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Sedan sedan = new Sedan("Mercedes-Benz", "S500", 5, 250.0);
        Crossover crossover = new Crossover("BMW", "X6", 5, 250.0, 6000.0);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(sedan);
        vehicles.add(crossover);

        String jsonDataString = mapper.writeValueAsString(vehicles);
        System.out.println("After Serialization:");
        System.out.println(jsonDataString);

        assertThat(jsonDataString, containsString("make"));
        assertThat(jsonDataString, not(containsString("model")));
        assertThat(jsonDataString, not(containsString("seatingCapacity")));
        assertThat(jsonDataString, not(containsString("topSpeed")));
        assertThat(jsonDataString, containsString("towingCapacity"));
    }
}
