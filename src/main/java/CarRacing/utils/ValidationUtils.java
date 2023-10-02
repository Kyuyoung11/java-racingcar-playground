package CarRacing.utils;

public class ValidationUtils {
    public static void valiateCarName(String carName, int carLength) throws RuntimeException {
        if(carName.length()>=carLength) {
            throw new RuntimeException("자동차 이름은 "+carLength+"자를 초과할 수 없습니다.");
        }
    }
}
