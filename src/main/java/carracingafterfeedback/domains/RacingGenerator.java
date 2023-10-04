package carracingafterfeedback.domains;


import carracingafterfeedback.view.RacingInputView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGenerator {
    public Cars getCars() {
        //1. 경주할 자동차 문자열 입력받기
        String carsString = RacingInputView.getCarString();

        //2. Cars 생성
        return createCars(carsString);
    }
    public Cars createCars(String carsString) {
        String[] carNames = carsString.split(",");

        List<Car> cars = Arrays.stream(carNames)
                .map(Car::new)
                .collect(Collectors.toList());

        return new Cars(cars);
    }

    public void doRacingCars(Cars cars) {
        //1. 시도횟수 입력
        int tryCnt = RacingInputView.getTryCount();

        //2. 전진
        moveCars(tryCnt, cars);
    }

    public void moveCars(int tryCnt, Cars cars) {
        for (int i=0; i<tryCnt; i++) {
            cars.forEach(car -> car.move(new RandomMovingStrategy()));
        }
    }

}
