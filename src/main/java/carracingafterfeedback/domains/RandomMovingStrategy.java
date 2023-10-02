package carracingafterfeedback.domains;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy{
    private static final int MAX_NUMBER = 10;
    private static final int MIN_MOVABLE_NUMBER = 4;
    @Override
    public boolean movable() {
        return MIN_MOVABLE_NUMBER <= getRandomNumber();
    }

    private int getRandomNumber() {
        Random rd = new Random();
        return rd.nextInt(MAX_NUMBER);
    }


}
