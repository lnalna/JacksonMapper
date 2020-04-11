package json.localdatetimeserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.time.LocalDateTime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class MainClass {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.of(2014, 12, 20, 2, 30);
        Event event = new Event("party", date);

        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(event);
        assertThat(result, containsString("2014,12,20,2,30"));
        System.out.println("\n After serialization:");
        System.out.println(result);

        System.out.println("\nAfter deserialization:");
        Event deserialized = mapper.readValue(result, Event.class);
        System.out.println(deserialized);
    }
}
