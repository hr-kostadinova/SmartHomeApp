package entities;

import enums.Mode;
import enums.PositionType;
import enums.PowerType;
import services.Lightning;

import java.time.LocalDate;

public class SmartLight extends Device implements Lightning {

    private int maxLumens;
    private Mode mode;

    public SmartLight(String model, LocalDate productionDate, double power, PositionType positionType, Manufacturer manufacturer, PowerType powerType, int maxLumens, Mode mode) {
        super(model, productionDate, power, positionType, manufacturer, powerType);
        this.maxLumens = maxLumens;
        this.mode = mode;
    }

    @Override
    public int light() {
        if (this.mode == Mode.STRONG) {
            return maxLumens;
        } else {
            return maxLumens - maxLumens * 20 / 100;
        }
    }

    @Override
    public String toString() {
        return "entities.SmartLight{" +
                "maxLumens=" + maxLumens +
                ", mode=" + mode +
                "} " + super.toString();
    }
}
