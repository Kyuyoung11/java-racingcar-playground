package CarRacing.object;

import lombok.Getter;

import java.util.List;

@Getter
public class Cars {
    List<Car> cars;

    public Cars() {

    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

}
