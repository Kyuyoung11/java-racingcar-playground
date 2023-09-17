package CarRacingTest;

import CarRacing.object.CarMovingInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarMovingInfoTest {
    private CarMovingInfo carMovingInfo;

    @BeforeEach
    void setup() {
        carMovingInfo = new CarMovingInfo(4,9,0);
    }

    @Test
    void validate_숫자리턴() throws Exception {
        assertEquals(carMovingInfo.validateMovingNumber(0),0);
        assertEquals(carMovingInfo.validateMovingNumber(1),0);
        assertEquals(carMovingInfo.validateMovingNumber(2),0);
        assertEquals(carMovingInfo.validateMovingNumber(3),0);
        assertEquals(carMovingInfo.validateMovingNumber(4),4);
        assertEquals(carMovingInfo.validateMovingNumber(9),9);
    }

    @Test
    void validate_오류발생() throws Exception {
        assertThatThrownBy(() -> {
            carMovingInfo.validateMovingNumber(10);
        }).isInstanceOf(Exception.class)
                .hasMessageContaining("초과");
    }



}
