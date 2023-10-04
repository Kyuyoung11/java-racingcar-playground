package carracingafterfeedback;

import carracingafterfeedback.domains.Cars;
import carracingafterfeedback.domains.RacingGenerator;
import carracingafterfeedback.view.RacingPrinter;

public class RacingMain {
    private static final RacingGenerator racingGenerator = new RacingGenerator();
    public static void main(String[] args) {
        _startRacingGame();
    }

    private static void _startRacingGame() {
        //1. 경주 자동차 조회
        Cars cars = racingGenerator.getCars();

        //2. 경주
        racingGenerator.doRacingCars(cars);

        //3. 우승자 출력
        RacingPrinter.printWinners(cars);
    }
}
