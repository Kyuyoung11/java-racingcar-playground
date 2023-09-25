package CarRacing.service;

import CarRacing.object.Car;
import CarRacing.object.Cars;

import java.util.List;

public class ResultPrinter {
    public static void printMoveResult(Cars cars) {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
        System.out.println();
    }

    public static void printWinner(Cars cars) {
        String winners = String.join(",",cars.getWinnerCars());
        System.out.println(winners+"가 최종 우승했습니다.");


    }
}
