package CarRacingTest;

import CarRacing.object.Car;
import CarRacing.object.Cars;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarsTest {
    Cars cars;

    @BeforeEach
    void setUp(){
        cars = new Cars();
        cars.addCar(new Car("a"));
        cars.addCar(new Car("B"));
        cars.addCar(new Car("c"));
    }

    @Test
    void moveCarsTest() {
        cars.moveCars();
        assertTrue(cars.getCars().get(0).getDistance() > 0);
    }
}
