import entities.Manufacturer;
import enums.Mode;
import enums.PositionType;
import entities.SmartLight;
import entities.VacuumCleaner;
import enums.PowerType;

import java.time.LocalDate;

public class Main {
    /*
    entities.Device has model, date of production, power, and type (BUILT-IN, MOVABLE)
    Some of the devices can be used for a lightning system and other devices can be used for cleaning.
    Create an interface services.Cleanable with method clean(double targetArea), that returns the cleaned area.
    entities.VacuumCleaner has model, date of production, power, type (BUILT-IN, MOVABLE), and mop-functionality.
    Vacuum cleaners have the max-area that can be cleaned. This max-area is one and the same for all vacuum cleaners.
    Implement method clean(double targetArea), that returns the area cleaned: return the targetArea,
    if it is less than or equal to max-area, otherwise return max-area.
    Create an interface services.Lightning with method light(), that returns the lumens of the light.
    entities.SmartLight has a model, date of production, power, type (BUILT-IN, MOVABLE),
    max lumens, and the option to set the mode (DIM, MEDIUM, STRONG).
    Implement method light() that returns the lumens: if the light is in STRONG mode, return the max lumens;
    if the light is in DIM mode reduce the max lumens by 20 %.
    * */

    public static void main(String[] args) {

        Manufacturer manufacturer = new Manufacturer("Philips");

        SmartLight smartLight1 = new SmartLight("L1", LocalDate.of(2022, 1, 1), 3, PositionType.BUILT_IN, manufacturer, PowerType.ELECTRIC, 2000, Mode.DIM);
        SmartLight smartLight2 = new SmartLight("L2", LocalDate.of(2022, 3, 3), 5, PositionType.MOVABLE, manufacturer, PowerType.ELECTRIC, 1500, Mode.STRONG);

        System.out.println(smartLight1);
        System.out.println(smartLight1.light());
        System.out.println(smartLight2);
        System.out.println(smartLight2.light());

        VacuumCleaner vacuumCleaner1 = new VacuumCleaner("V1", LocalDate.of(2021, 1, 1), 1200, PositionType.MOVABLE, manufacturer, PowerType.ELECTRIC, true);
        VacuumCleaner vacuumCleaner2 = new VacuumCleaner("V1", LocalDate.of(2020, 4, 4), 1000, PositionType.MOVABLE, manufacturer, PowerType.ELECTRIC, false);

        VacuumCleaner.setMaxArea(150);
        System.out.println(vacuumCleaner1);
        System.out.println(vacuumCleaner1.clean(100));
        System.out.println(vacuumCleaner2);
        System.out.println(vacuumCleaner2.clean(200));
    }
}
