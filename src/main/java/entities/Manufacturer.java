package entities;

import java.util.HashMap;
import java.util.Map;

public class Manufacturer {
    private String name;

    public Manufacturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "entities.Manufacturer{" +
                "name='" + name + '\'' +
                '}';
    }
}
