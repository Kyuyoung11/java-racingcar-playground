package CarRacing.object;

import lombok.Getter;

import java.util.Random;

@Getter
public class CarMovingInfo {
    int minMovingNumber;
    int maxMovingNumber;
    int notMovingNumber;

    public CarMovingInfo() {}
    public CarMovingInfo(int minMovingNumber, int maxMovingNumber, int notMovingNumber) {
        this.minMovingNumber = minMovingNumber;
        this.maxMovingNumber = maxMovingNumber;
        this.notMovingNumber = notMovingNumber;
    }

    public int validateMovingNumber(int movingNumber) throws Exception{
        if (movingNumber < this.minMovingNumber)
            return this.notMovingNumber;
        if (movingNumber > this.maxMovingNumber)
            throw new Exception("움직일 숫자가 "+this.maxMovingNumber+"을 초과할 수 없습니다.");
        return movingNumber;
    }

    public int getMoveNumber() {
        try {
            Random rd = new Random();
            int randomNumber = rd.nextInt(9);
            return validateMovingNumber(randomNumber);
        } catch(Exception e) {
            System.out.println("[오류]"+e.toString());
        }
        return this.notMovingNumber;
    }


}
