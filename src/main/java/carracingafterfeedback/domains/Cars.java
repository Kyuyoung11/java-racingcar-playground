package carracingafterfeedback.domains;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars implements Iterable<Car>{
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }


    public Car getCarByIndex(int i) {
        _validateIndexValue(i);
        return cars.get(i);
    }

    private void _validateIndexValue(int i){
        if (i < 0) {
            throw new RuntimeException("Index값은 0 이상이어야 합니다.");
        }
        if (cars.size() < i) {
            throw new RuntimeException("Index값은 "+ (cars.size()-1) + "를 초과할 수 없습니다.");
        }
    }

    public Cars getWinners() {
        //1. position 최대값 조회
        int maxPosition = getMaxPosition();

        //2. position이 최대값인 Car List
        List<Car> winnerCars = this.cars.stream()
                .filter(car->car.isEqualPosition(maxPosition))
                .collect(Collectors.toList());

        return new Cars(winnerCars);
    }

    //TODO : Position 으로 반환하도록
    public int getMaxPosition() {
        return this.cars.stream()
                .mapToInt(Car::getPositionValue)
                .max()
                .getAsInt();
    }


    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }
}
