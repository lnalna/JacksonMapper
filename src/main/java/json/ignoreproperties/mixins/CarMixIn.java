package json.ignoreproperties.mixins;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class CarMixIn {
    @JsonIgnore
    public String make;
    @JsonIgnore
    public String topSpeed;
}
