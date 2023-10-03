package carracingafterfeedback.domains;

import java.util.Iterator;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }
    

    public Car getCarByIndex(int i) throws Exception {
        _validateIndexValueOverCarSize(i);
        return cars.get(i-1);
    }

    private void _validateIndexValueOverCarSize(int i) throws Exception {
        if (cars.size() < i-1) {
            throw new Exception("Index값은 "+ cars.size() + "를 초과할 수 없습니다.");
        }
    }


}
