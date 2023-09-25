package CarRacingTest;

import CarRacing.object.CarMovingInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class CarMovingInfoTest {
    private CarMovingInfo carMovingInfo;

    @BeforeEach
    void setup() {
        carMovingInfo = new CarMovingInfo(4,9,1,0);
    }

    @Test
    void moveTest() {
        int movingNumber = carMovingInfo.getMovingNumber();
        assertTrue(movingNumber==carMovingInfo.getFixedMovingNumber() ||
                movingNumber == carMovingInfo.getNotMovingNumber());
    }



}
