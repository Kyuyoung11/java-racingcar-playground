package carracingafterfeedback;

import carracingafterfeedback.domains.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    void 생성자() {
        Car car = new Car("a");
        assertEquals(car.getPositionValue(),0);
    }

    @Test
    void 전진테스트() {
        Car car = new Car("a");
        car.move();
        assertEquals(car.getPositionValue(),1);
    }

    @Test
    void 검증테스트_오류() {
        assertThatThrownBy(() -> new Car("asdafsdadfadafsd"))
                .isInstanceOf(RuntimeException.class);
    }
}
