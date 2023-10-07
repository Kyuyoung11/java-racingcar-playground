package carracingafterfeedback;

import carracingafterfeedback.domains.Car;
import carracingafterfeedback.domains.Cars;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stringAddCalculator.StringCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsTest {
    Cars cars;
    Car car1;
    Car car2;
    Car car3;

    @BeforeEach
    void setUp() {
        car1 = new Car("a");
        car2 = new Car("b");
        car3 = new Car("c");

        cars = new Cars(Arrays.asList(car1,car2,car3));
    }
    @Test
    void Cars_생성자() {
        assertEquals(car1.getName(), "a");
    }

    @Test
    void 차이름_인덱스로가져오기_검증오류() {
        assertThatThrownBy(() -> cars.getCarByIndex(4))
                .isInstanceOf(RuntimeException.class);
        assertThatThrownBy(() -> cars.getCarByIndex(-1))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void 우승한자동차() {
        car1 = new Car("a",4);
        car2 = new Car("b",5);
        car3 = new Car("c", 5);
        cars = new Cars(Arrays.asList(car1,car2,car3));

        Cars winnerCars = cars.getWinners();
        assertEquals(winnerCars.getCarByIndex(0).getName(),"b");
        assertEquals(winnerCars.getCarByIndex(1).getName(),"c");
    }
}
