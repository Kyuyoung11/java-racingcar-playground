package carracingafterfeedback;

import carracingafterfeedback.domains.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    void 생성자() {
        Car car = new Car("a");
        assertEquals(car.getPosition(),0);
    }
}
