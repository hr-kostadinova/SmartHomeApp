package entities;

import enums.PositionType;
import enums.PowerType;

import java.time.LocalDate;

public class Cooker extends Device {

    private PowerType powerType;
    
    public Cooker() {}

    public Cooker(String model, LocalDate productionDate, double power, PositionType positionType, Manufacturer manufacturer, PowerType powerType, PowerType powerType1) {
        super(model, productionDate, power, positionType, manufacturer, powerType);
        this.powerType = powerType1;
    }

    public PowerType getPowerType() {
        return powerType;
    }

//     @Override
//     public String toString() {
//         return "entities.Cooker{" +
//                 "powerType=" + powerType +
//                 "} " + super.toString();
//     }
}
