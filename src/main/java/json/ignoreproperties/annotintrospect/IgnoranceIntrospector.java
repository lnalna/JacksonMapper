package json.ignoreproperties.annotintrospect;

import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

class IgnoranceIntrospector extends JacksonAnnotationIntrospector {
    public boolean hasIgnoreMarker(AnnotatedMember m) {
        return m.getDeclaringClass() == Vehicle.class && m.getName() == "model"
                || m.getDeclaringClass() == Car.class
                || m.getName() == "towingCapacity"
                || super.hasIgnoreMarker(m);
    }
}
