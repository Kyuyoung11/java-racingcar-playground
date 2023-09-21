package CarRacing.object;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class Cars implements Iterable<Car>{
    private final List<Car> cars;

    public Cars() {
        cars = new ArrayList<>();
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }

    public void moveCars() {
        CarMovingInfo carMovingInfo = new CarMovingInfo(4,9,0);
        for (Car car: this.cars) {
            car.moveCar(carMovingInfo.getMoveNumber());
        }
    }
}
