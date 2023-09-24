package CarRacing.object;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

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


    public Integer getMaxDistance() {
        return this.cars.stream()
                .mapToInt(Car::getDistance)
                .max()
                .getAsInt();
    }

    public List<String> getWinnerCars() {
        return this.cars.stream()
                .filter(car-> getMaxDistance() == car.getDistance())
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
