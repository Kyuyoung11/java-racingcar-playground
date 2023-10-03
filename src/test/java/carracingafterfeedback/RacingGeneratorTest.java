package carracingafterfeedback;

import carracingafterfeedback.domains.Cars;
import carracingafterfeedback.domains.RacingGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RacingGeneratorTest {
    RacingGenerator racingGenerator;
    @BeforeEach
    void setUp() {
        racingGenerator = new RacingGenerator();
    }

    @Test
    void  createCars_테스트() throws Exception {
        Cars cars = racingGenerator.createCars("a,b,c");
        assertEquals(cars.getCarByIndex(1).getName(), "a");
        assertEquals(cars.getCarByIndex(2).getName(), "b");
        assertEquals(cars.getCarByIndex(3).getName(), "c");
    }
}
