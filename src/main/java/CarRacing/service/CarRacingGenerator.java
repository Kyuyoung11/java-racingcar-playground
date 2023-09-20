package CarRacing.service;

import CarRacing.object.Car;
import CarRacing.object.CarMovingInfo;
import CarRacing.object.Cars;
import CarRacing.object.Splitter;

import java.util.Arrays;

public class CarRacingGenerator {
    public Cars makeCars(String carNameString) {
        Splitter splitter = new Splitter(",");

        Cars cars = new Cars();
        Arrays.stream(splitter.doSplit(carNameString))
                .forEach(carName -> cars.addCar(new Car(carName)));
        return cars;
    }



}
