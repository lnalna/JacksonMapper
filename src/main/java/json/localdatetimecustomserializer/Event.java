package json.localdatetimecustomserializer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

public class Event {
    public String name;
    /*так лучше не делать через JsonSerializer<LocalDateTime>/JsonDeserializer<LocalDateTime>

    * random fact: if i nest above classes and don't make them static,
    * the error message is weird: org.springframework.web.HttpMediaTypeNotSupportedException:
    * Content type 'application/json;charset=UTF-8' not supported
    *
    https://stackoverflow.com/questions/27952472/serialize-deserialize-java-8-java-time-with-jackson-json-mapper
    * */
    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    public LocalDateTime eventDate;

    @JsonCreator
    public Event(
            @JsonProperty("name") String name,
            @JsonProperty("date") LocalDateTime date) {
        this.name = name;
        this.eventDate = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", eventDate=" + eventDate +
                '}';
    }
}
