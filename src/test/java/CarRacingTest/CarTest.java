package CarRacingTest;

import CarRacing.object.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("test");
    }
    @Test
    void moveCarTest() {
        car.moveCar(1);
        assertEquals(car.getDistance(),1);

        car.moveCar(4);
        assertEquals(car.getDistance(),5);
    }

    @Test
    void toStringTest() {
        car.moveCar(3);
        assertEquals(car.toString(),"test : ---");
        car.moveCar(5);
        assertEquals(car.toString(), "test : --------");

    }


}
