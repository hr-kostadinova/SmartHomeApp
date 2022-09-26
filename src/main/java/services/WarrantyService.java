package services;

import exceptions.NegativeNumberOfMonthsException;

public interface WarrantyService {
    int warranty() throws NegativeNumberOfMonthsException;
}
