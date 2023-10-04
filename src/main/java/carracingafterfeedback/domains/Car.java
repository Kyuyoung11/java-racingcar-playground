package carracingafterfeedback.domains;

public class Car {
    private final String name;
    private Position position;

    private static final int MAX_NAME_LENGTH = 5;

    public Car(String name) {
        _validateCarName(name);
        this.name = name;
        this.position = new Position(0);
    }

    public Car(String name, int position) {
        _validateCarName(name);
        this.name = name;
        this.position = new Position(position);
    }

    private void _validateCarName(String name) {
        if (name.length()>=MAX_NAME_LENGTH) {
            throw new RuntimeException("자동차 이름은 "+MAX_NAME_LENGTH+"자를 초과할 수 없습니다.");
        }
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.movable())
            this.position = this.position.add();
    }

    public int getPositionValue() {
        return this.position.getPosition();
    }

    public String getName() {
        return this.name;
    }

    public boolean isEqualPosition(int maxPosition) {
        return this.position.isEqualPosition(maxPosition);
    }
}
