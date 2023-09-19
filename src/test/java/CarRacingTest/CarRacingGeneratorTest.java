package CarRacingTest;

import CarRacing.object.Car;
import CarRacing.object.Cars;
import CarRacing.service.CarRacingGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarRacingGeneratorTest {
    CarRacingGenerator carRacingGenerator;

    @BeforeEach
    void setUp() {
        carRacingGenerator = new CarRacingGenerator();
    }

    @Test
    void makeCarsTest() {
        Cars testCars = carRacingGenerator.makeCars("1,a,zzz");
        assertEquals(testCars.getCars().get(0).getName(), "1");
        assertEquals(testCars.getCars().get(1).getName(), "a");
        assertEquals(testCars.getCars().get(2).getName(), "zzz");
    }

    @Test
    void moveCars() {
        Cars testCars = carRacingGenerator.makeCars("1,a,zzz");
        testCars = carRacingGenerator.moveCars(testCars);
        for (Car car : testCars.getCars()) {
            assertTrue(car.getDistance() > 0);
        }
    }


}
