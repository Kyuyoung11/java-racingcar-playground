package carracingafterfeedback.view;

import carracingafterfeedback.domains.Car;

public class RacingPrinter {
    public static String makeHyphens(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<count; i++) {
            sb.append('-');
        }
        return sb.toString();
    }

    public static void printCar(Car car) {
        System.out.print(car.getName()+" : " + makeHyphens(car.getPositionValue()));
    }

}
