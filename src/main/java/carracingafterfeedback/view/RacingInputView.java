package carracingafterfeedback.view;

import java.util.Scanner;

public class RacingInputView {
    public static String getCarString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return sc.nextLine();
    }

}