package CarRacing.object;

import lombok.Getter;

import java.util.Random;

@Getter
public class CarMovingInfo {
    int minRandomNumber;
    int maxRandomNumber;
    int fixedMovingNumber;
    int notMovingNumber;

    public CarMovingInfo() {}
    public CarMovingInfo(int minRandomNumber, int maxRandomNumber, int fixedMovingNumber, int notMovingNumber) {
        this.minRandomNumber = minRandomNumber;
        this.maxRandomNumber = maxRandomNumber;
        this.fixedMovingNumber = fixedMovingNumber;
        this.notMovingNumber = notMovingNumber;
    }

    public int getMovingNumber() {
        Random rd = new Random();
        int randomNumber = rd.nextInt(maxRandomNumber);
        if(_canMove(randomNumber)) {
            return this.fixedMovingNumber;
        }
        return this.notMovingNumber;
    }

    private boolean _canMove(int randomNumber) {
        return randomNumber >= minRandomNumber;
    }


}
