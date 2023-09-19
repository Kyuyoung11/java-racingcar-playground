package CarRacingTest;

import CarRacing.object.Cars;
import CarRacing.service.CarRacingGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


}
