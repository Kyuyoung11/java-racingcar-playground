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
        //TODO .add 코드 없애보려는 고민 (병준님 코드 보기) -> Car 객체로 재사용할 수 있어서 좀 더 용이~
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

    @Test
    void 우승한자동차() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("a",3));
        carList.add(new Car("b",4));
        carList.add(new Car("c",4));
        cars = new Cars(carList);

        Cars winnerCars = cars.getWinners();
        assertEquals(winnerCars.getCarByIndex(0).getName(),"b");
        assertEquals(winnerCars.getCarByIndex(1).getName(),"c");
    }
}
