package CarRacingTest;

import CarRacing.object.Car;
import CarRacing.object.Cars;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsTest {
    Cars cars;

    @BeforeEach
    void setUp(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("a"));
        carList.add(new Car("B"));
        carList.add(new Car("c"));
        cars = new Cars(carList);
    }

    @Test
    void getMaxDistanceTest() {
        cars.getCars().get(0).moveCar(5);
        cars.getCars().get(1).moveCar(3);
        cars.getCars().get(2).moveCar(8);
        assertEquals(8, (int) cars.getMaxDistance());
    }

    @Test
    void getWinnersTest() {
        cars.getCars().get(0).moveCar(5);
        cars.getCars().get(1).moveCar(8);
        cars.getCars().get(2).moveCar(8);
        assertEquals(cars.getWinnerCars(), Arrays.asList("B", "c"));
    }

}
