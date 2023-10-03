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

    private void _validateCarName(String name) {
        if (name.length()>=MAX_NAME_LENGTH) {
            throw new RuntimeException("자동차 이름은 "+MAX_NAME_LENGTH+"자를 초과할 수 없습니다.");
        }
    }

    public void move() {
        this.position = this.position.add();
    }

    public int getPositionValue() {
        return this.position.getPosition();
    }

    public String getName() {
        return this.name;
    }
}
