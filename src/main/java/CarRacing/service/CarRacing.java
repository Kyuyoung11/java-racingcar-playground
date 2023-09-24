package CarRacing.service;

import CarRacing.object.Car;
import CarRacing.object.CarMovingInfo;
import CarRacing.object.Cars;
import CarRacing.object.Splitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarRacing {
    public Cars makeCars(String carNameString) {
        Splitter splitter = new Splitter(",");

        List<Car> carList = new ArrayList<>();
        Arrays.stream(splitter.doSplit(carNameString))
                .forEach(carName -> carList.add(new Car(carName)));
        return new Cars(carList);
    }

    public Cars moveCars(Cars cars) {
        CarMovingInfo carMovingInfo = new CarMovingInfo(4,9,0);
        for (Car car: cars) {
            car.moveCar(carMovingInfo.getMoveNumber());
        }
        return cars;
    }

}
