package CarRacing.service;

import CarRacing.object.*;
import CarRacing.utils.ValidationUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarRacing {
    public Cars makeCars(String carNameString) throws RuntimeException {
        //1. split 구분자 정의, car Name 길이 정의
        Splitter splitter = new Splitter(",");
        Length carLength = new Length(5);

        //2. carList 조립
        List<Car> carList = new ArrayList<>();

        for(String carName : splitter.doSplit(carNameString)) {
            ValidationUtils.valiateCarName(carName, carLength.getValue());
            carList.add(new Car(carName, 0));
        }

        //3. Cars 생성
        return new Cars(carList);
    }

    public void moveCars(Cars cars) {
        CarMovingInfo carMovingInfo = new CarMovingInfo(4,9,1,0);
        for (Car car : cars) {
            car.moveCar(carMovingInfo.getMovingNumber());
        }
    }

}
