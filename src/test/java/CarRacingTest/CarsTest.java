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
        carList.add(new Car("a",0));
        carList.add(new Car("B",0));
        carList.add(new Car("c",0));
        cars = new Cars(carList);
    }

    @Test
    void getMaxDistanceTest() {
        cars.getCars().get(0).moveCar(1);
        cars.getCars().get(1).moveCar(0);
        cars.getCars().get(2).moveCar(0);
        assertEquals(1, (int) cars.getMaxDistance());
    }

    @Test
    void getWinnersTest() {
        cars.getCars().get(0).moveCar(0);
        cars.getCars().get(1).moveCar(1);
        cars.getCars().get(2).moveCar(1);
        assertEquals(cars.getWinnerCars(), Arrays.asList("B", "c"));
    }

}
