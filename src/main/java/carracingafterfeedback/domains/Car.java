package carracingafterfeedback.domains;

public class Car {
    private final String name;
    private Position position;

    public Car(String name) {
        this.name = name;
        this.position = new Position(0);
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
