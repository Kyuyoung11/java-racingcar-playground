package CarRacingTest;

import CarRacing.object.Cars;
import CarRacing.service.CarRacing;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarRacingTest {

    CarRacing carRacing;
    @BeforeEach
    void setUp() {
        carRacing = new CarRacing();
    }

    @Test
    void makeCarsTest() {
        Cars testCars = carRacing.makeCars("1,a,zzz");
        assertEquals(testCars.getCars().get(0).getName(), "1");
        assertEquals(testCars.getCars().get(1).getName(), "a");
        assertEquals(testCars.getCars().get(2).getName(), "zzz");
    }

    @Test
    void moveCarsTest() {
        Cars testCars = carRacing.makeCars("1,a,zzz");
        carRacing.moveCars(testCars);
    }


}
