package carracingafterfeedback.view;

import carracingafterfeedback.domains.Car;
import carracingafterfeedback.domains.Cars;

import java.util.ArrayList;
import java.util.List;

public class RacingPrinter {
    public static String makeHyphens(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<count; i++) {
            sb.append('-');
        }
        return sb.toString();
    }

    public static void printCar(Car car) {
        System.out.println(car.getName()+" : " + makeHyphens(car.getPositionValue()));
    }

    public static void printCars(Cars cars) {
        cars.forEach(RacingPrinter::printCar);
        System.out.println();
    }

    public static void printWinners(Cars cars) {
        String winnerNames = _makeCarNames(cars.getWinners());
        System.out.println(winnerNames+"가 최종 우승했습니다.");
    }

    private static String _makeCarNames(Cars cars) {
        List<String> names = new ArrayList<>();
        for (Car car : cars) {
            names.add(car.getName());
        }
        return String.join(",",names);
    }

}
