package carracingafterfeedback;

import carracingafterfeedback.domains.Car;
import carracingafterfeedback.view.RacingPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RacingPrinterTest {
    @Test
    void 개수만큼_하이픈프린트() {
        assertEquals(RacingPrinter.makeHyphens(4),"----");
    }

}
