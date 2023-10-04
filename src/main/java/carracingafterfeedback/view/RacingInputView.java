package carracingafterfeedback.view;

import java.util.Scanner;

public class RacingInputView {
    public static String getCarString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return sc.nextLine();
    }

    public static int getTryCount() {
        while(true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("시도할 회수는 몇회인가요?");
                return sc.nextInt();
            } catch (Exception e){
                System.out.println("[오류] "+e);
            }
        }
    }
}
