package entities;

import enums.PositionType;
import enums.PowerType;
import services.Cleanable;

import java.time.LocalDate;

public class VacuumCleaner extends Device implements Cleanable {
    private boolean hasMop;
    private static double maxArea;

    public VacuumCleaner(String model, LocalDate productionDate, double power, PositionType positionType, Manufacturer manufacturer, PowerType powerType, boolean hasMop) {
        super(model, productionDate, power, positionType, manufacturer, powerType);
        this.hasMop = hasMop;
    }

    public boolean isHasMop() {
        return hasMop;
    }

    public void setHasMop(boolean hasMop) {
        this.hasMop = hasMop;
    }

    public static double getMaxArea() {
        return maxArea;
    }

    public static void setMaxArea(double maxArea) {
        VacuumCleaner.maxArea = maxArea;
    }

    @Override
    public double clean(double targetArea) {
        if (targetArea <= maxArea) {
            return targetArea;
        } else {
            return maxArea;
        }
    }

    @Override
    public String toString() {
        return "entities.VacuumCleaner{" +
                "hasMop=" + hasMop +
                "} " + super.toString();
    }
}
