package CarRacing;


import CarRacing.object.Cars;
import CarRacing.service.CarRacing;
import CarRacing.service.ResultPrinter;
import CarRacing.view.InputView;

public class Main {
    private final static CarRacing carRacing = new CarRacing();
    public static void main(String[] args) {
        _startGame();
    }

    private static void _startGame() {
        //1. 자동차 get
        Cars cars = _createCars();

        //2. 시도 횟수 입력
        int tryNumber = InputView.getTryNumberInput();

        System.out.println("\n실행 결과");
        //3. 전진
        for(int i=0; i<tryNumber; i++) {
            carRacing.moveCars(cars);
            ResultPrinter.printMoveResult(cars);
        }

        //4. 결과 출력
        ResultPrinter.printWinner(cars);
    }

    private static Cars _createCars() {
        while(true) {
            //1-1. 자동차 이름 입력
            String carNames = InputView.getCarNamesInput();

            //1-2. make Cars
            try {
                return carRacing.makeCars(carNames);
            } catch (RuntimeException e) {
                System.out.println("[오류] : " + e.getMessage());
            }
        }
    }
}
