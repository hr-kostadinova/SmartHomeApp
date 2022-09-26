import entities.WarrantyData;
import enums.PositionType;
import enums.PowerType;
import entities.Device;
import entities.Manufacturer;
import exceptions.NegativeNumberOfMonthsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.WarrantyServiceImpl;

import java.time.LocalDate;
import java.util.EnumMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WarrantyServiceTest {

    Manufacturer manufacturer;
    Map<PowerType, Integer> powerTypeMap;

    @BeforeEach
    void init() {
        manufacturer = new Manufacturer("Philips");
        powerTypeMap = new EnumMap<>(PowerType.class);
        powerTypeMap.put(PowerType.GAS, 12);
        powerTypeMap.put(PowerType.ELECTRIC, 6);
    }

    @Test
    void warrantyGAS() throws NegativeNumberOfMonthsException {
        Device device = new Device("T1", LocalDate.of(2020, 5, 4), 1200, PositionType.BUILT_IN, manufacturer, PowerType.GAS);
        WarrantyData warrantyData = new WarrantyData(12, 0, powerTypeMap);
        WarrantyServiceImpl warrantyService = new WarrantyServiceImpl(warrantyData, device);
        assertEquals(24, warrantyService.warranty());
    }

    @Test
    void warrantyELECTRIC() throws NegativeNumberOfMonthsException {
        Device device = new Device("T1", LocalDate.of(2020, 5, 4), 1200, PositionType.BUILT_IN, manufacturer, PowerType.ELECTRIC);
        WarrantyData warrantyData = new WarrantyData(12, 0, powerTypeMap);
        WarrantyServiceImpl warrantyService = new WarrantyServiceImpl(warrantyData, device);
        assertEquals(18, warrantyService.warranty());
    }

    @Test
    void warrantyNegativeNumberOfMonths() {
        Device device = new Device("T1", LocalDate.of(2020, 5, 4), 1200, PositionType.BUILT_IN, manufacturer, PowerType.GAS);
        Map<PowerType, Integer> map = new EnumMap<>(PowerType.class);
        WarrantyData warrantyData = new WarrantyData(-12, 6, map);
        WarrantyServiceImpl warrantyService = new WarrantyServiceImpl(warrantyData, device);
        assertThrows(NegativeNumberOfMonthsException.class, () -> warrantyService.warranty());
    }


}