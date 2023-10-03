package carracingafterfeedback.domains;


import java.util.ArrayList;
import java.util.List;

public class RacingGenerator {
    public Cars createCars(String carInput) {
        String[] carNames = carInput.split(",");

        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }

        return new Cars(cars);
    }
}
