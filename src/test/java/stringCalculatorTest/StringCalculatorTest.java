package stringCalculatorTest;

import org.junit.jupiter.api.Test;
import stringAddCalculator.StringCalculator;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    public void splitStringNullOrEmpty() {
        int sum = StringCalculator.splitAndSum(null);
        assertEquals(sum,0);

        sum = StringCalculator.splitAndSum("");
        assertEquals(sum, 0);
    }

    @Test
    public void splitStringNum1() {
        int sum = StringCalculator.splitAndSum("1");
        assertEquals(sum, 1);
    }

    @Test
    public void splitAndSumString_쉼표() {
        int sum = StringCalculator.splitAndSum("1,2");
        assertEquals(sum, 3);

    }

    @Test
    public void splitAndSumString_쉼표또는콜론() {
        int sum = StringCalculator.splitAndSum("1,2:3");
        assertEquals(sum, 6);
    }

    @Test
    public void splitAndSumString_Custom() {
        int sum = StringCalculator.splitAndSum("//;\n1;2;3");
        assertEquals(sum, 6);
    }

    @Test
    public void splitAndSum_ThrowException() throws Exception {
        assertThatThrownBy(() -> StringCalculator.splitAndSum("-1,2,3"))
                .isInstanceOf(RuntimeException.class);

    }


}
