package entities;

import enums.PowerType;

import java.util.EnumMap;
import java.util.Map;

public class WarrantyData {

    private int minWarrantyNumberOfMonths;
    private int extendedWarrantyNumberOfMonths;
    // GAS-> 12, ELECTRIC -> 6
    private Map<PowerType, Integer> warrantyPeriodsByType;

    public WarrantyData() {
        this.minWarrantyNumberOfMonths = 12;
        this.extendedWarrantyNumberOfMonths = 6;
        this.warrantyPeriodsByType = new EnumMap<PowerType, Integer>(PowerType.class);
    }

    public WarrantyData(int minWarrantyNumberOfMonths, int extendedWarrantyNumberOfMonths) {
        this.minWarrantyNumberOfMonths = minWarrantyNumberOfMonths;
        this.extendedWarrantyNumberOfMonths = extendedWarrantyNumberOfMonths;
        this.warrantyPeriodsByType = new EnumMap<PowerType, Integer>(PowerType.class);
    }

    public WarrantyData(int minWarrantyNumberOfMonths, int extendedWarrantyNumberOfMonths, Map<PowerType, Integer> warrantyPeriodsByType) {
        this.minWarrantyNumberOfMonths = minWarrantyNumberOfMonths;
        this.extendedWarrantyNumberOfMonths = extendedWarrantyNumberOfMonths;
        this.warrantyPeriodsByType = warrantyPeriodsByType;
    }

    public int getMinWarrantyNumberOfMonths() {
        return minWarrantyNumberOfMonths;
    }

    public int getExtendedWarrantyNumberOfMonths() {
        return extendedWarrantyNumberOfMonths;
    }

    public Map<PowerType, Integer> getWarrantyPeriodsByType() {
        return warrantyPeriodsByType;
    }

    @Override
    public String toString() {
        return "WarrantyEntity{" +
                "minWarrantyNumberOfMonths=" + minWarrantyNumberOfMonths +
                ", extendedWarrantyNumberOfMonths=" + extendedWarrantyNumberOfMonths +
                '}';
    }
}
