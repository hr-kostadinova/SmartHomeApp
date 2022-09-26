package services;

import entities.Device;
import entities.WarrantyData;
import exceptions.NegativeNumberOfMonthsException;

/**
 * Implements warranty calculations, based on warranty data and concrete device
 */
public class WarrantyServiceImpl implements WarrantyService {

    private WarrantyData warranty;
    private Device device;

    /**
     * Constructor with two parameters. Constructs the WarrantyServiceImpl object, based on warranty and device.
     * @param warranty
     * @param device
     */
    public WarrantyServiceImpl(WarrantyData warranty, Device device) {
        this.warranty = warranty;
        this.device = device;
    }

    /**
     * @return Number of months extended warranty period
     */
    public int extendedWarranty() {
        if (this.warranty.getExtendedWarrantyNumberOfMonths() > 0) {
            return this.warranty.getExtendedWarrantyNumberOfMonths();
        }
        return 0;
    }

    /**
     * @return Number of months warranty period by power type
     */
    public int warrantyByType() {
        if (this.warranty.getWarrantyPeriodsByType().containsKey(device.getPowerType())) {
            return this.warranty.getWarrantyPeriodsByType().get(device.getPowerType());
        }
        return 0;
    }

    /**
     * @return Total number of months warranty period
     * @throws NegativeNumberOfMonthsException if the minimum number of months is a negative number
     */
    @Override
    public int warranty() throws NegativeNumberOfMonthsException {
        if (this.warranty.getMinWarrantyNumberOfMonths() < 0) {
            throw new NegativeNumberOfMonthsException();
        }
        return this.warranty.getMinWarrantyNumberOfMonths() + this.extendedWarranty() + this.warrantyByType();
    }
}
