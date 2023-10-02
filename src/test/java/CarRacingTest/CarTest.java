package CarRacingTest;

import CarRacing.object.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("test",0);
    }
    @Test
    void moveCarTest() {
        car.moveCar(1);
        assertEquals(car.getDistance(),1);

        car.moveCar(0);
        assertEquals(car.getDistance(),1);
    }

    @Test
    void toStringTest() {
        car.moveCar(1);
        assertEquals(car.toString(),"test : -");
        car.moveCar(1);
        assertEquals(car.toString(), "test : --");

    }


}
