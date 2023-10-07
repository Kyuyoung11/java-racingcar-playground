package carracingafterfeedback.domains;

public class Car {
    private final Name name;
    private Position position;


    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position(0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }


    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.movable())
            this.position = this.position.add();
    }

    public int getPositionValue() {
        return this.position.getPosition();
    }

    public Position getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name.getName();
    }

    public boolean isEqualPosition(Position maxPosition) {
        return this.position.isEqualPosition(maxPosition);
    }
}
