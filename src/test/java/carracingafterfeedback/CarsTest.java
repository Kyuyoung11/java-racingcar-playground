package carracingafterfeedback;

import carracingafterfeedback.domains.Car;
import carracingafterfeedback.domains.Cars;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stringAddCalculator.StringCalculator;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsTest {
    Cars cars;

    @BeforeEach
    void setUp() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("a"));
        carList.add(new Car("b"));
        carList.add(new Car("c"));

        cars = new Cars(carList);
    }
    @Test
    void 차이름_인덱스로가져오기_성공() {
        assertEquals(cars.getCarByIndex(0).getName(),"a");
    }

    @Test
    void 차이름_인덱스로가져오기_검증오류() {
        assertThatThrownBy(() -> cars.getCarByIndex(4))
                .isInstanceOf(RuntimeException.class);
        assertThatThrownBy(() -> cars.getCarByIndex(-1))
                .isInstanceOf(RuntimeException.class);
    }
}
