package CarRacing.object;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Cars {
    List<Car> cars;

    public Cars() {
        cars = new ArrayList<>();
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void moveCars() {
        CarMovingInfo carMovingInfo = new CarMovingInfo(4,9,0);
        cars.stream()
                .forEach(car -> car.moveCar(carMovingInfo.getMoveNumber()));
    }

}
