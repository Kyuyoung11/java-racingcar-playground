package carracingafterfeedback.domains;

public class Position {
    private final int position;

    public Position(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public Position add() {
        return new Position(this.position+1);
    }

    public boolean isEqualPosition(int maxPosition) {
        return this.position == maxPosition;
    }
}
