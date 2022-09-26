package entities;

import enums.PositionType;
import enums.PowerType;

import java.time.LocalDate;

public class WashingMachine extends Device {

    private boolean isDryer;
    private int cycles;

    public WashingMachine(String model, LocalDate productionDate, double power, PositionType positionType, Manufacturer manufacturer, PowerType powerType, boolean isDryer, int cycles) {
        super(model, productionDate, power, positionType, manufacturer, powerType);
        this.isDryer = isDryer;
        this.cycles = cycles;
    }

    public boolean isDryer() {
        return isDryer;
    }

    public int getCycles() {
        return cycles;
    }

    @Override
    public String toString() {
        return "entities.WashingMachine{" +
                "isDryer=" + isDryer +
                ", cycles=" + cycles +
                "} " + super.toString();
    }

}
