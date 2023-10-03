package carracingafterfeedback.domains;

import java.util.List;

public class Cars {
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


}
