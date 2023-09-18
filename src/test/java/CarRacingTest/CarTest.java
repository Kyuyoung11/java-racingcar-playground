package CarRacingTest;

import CarRacing.object.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
    Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    private void makeTestCar() {
        car = new Car("test");
    }


}
