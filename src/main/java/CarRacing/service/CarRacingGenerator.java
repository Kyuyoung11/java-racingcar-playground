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

    public Cars moveCars(Cars cars) {
        CarMovingInfo carMovingInfo = new CarMovingInfo(4,9,0);
        for (Car car: cars.getCars()) {
            car.moveCar(carMovingInfo.getMoveNumber());
        }
        return cars;
    }

}
