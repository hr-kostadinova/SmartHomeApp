package entities;

import enums.PositionType;
import enums.PowerType;

import java.time.LocalDate;

/**
 *
 */
public class Device {
    private String model;
    private LocalDate productionDate;
    private double power;
    private PositionType positionType;
    private Manufacturer manufacturer;
    private PowerType powerType;

    public Device() {
    }

    public Device(String model, LocalDate productionDate, double power, PositionType positionType, Manufacturer manufacturer, PowerType powerType) {
        this.model = model;
        this.productionDate = productionDate;
        this.power = power;
        this.positionType = positionType;
        this.manufacturer = manufacturer;
        this.powerType = powerType;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public double getPower() {
        return power;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public PowerType getPowerType() {
        return powerType;
    }

    @Override
    public String toString() {
        return "entities.Device{" +
                "model='" + model + '\'' +
                ", productionDate=" + productionDate +
                ", power=" + power +
                ", positionType=" + positionType +
                ", manufacturer=" + manufacturer +
                ", powerType=" + powerType +
                '}';
    }
}
