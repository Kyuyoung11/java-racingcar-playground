package CarRacing.service;

import CarRacing.object.Car;
import CarRacing.object.Cars;

public class ResultPrinter {
    public void printMoveResult(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.toString());
        }
        System.out.println();
    }
}
