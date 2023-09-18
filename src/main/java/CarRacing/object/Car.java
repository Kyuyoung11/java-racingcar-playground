package CarRacing.object;

public class Car {
    String name;
    int distance;

    public Car() {

    }

    public Car(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public Car(String name) {
        this.name = name;
        this.distance = 0;
    }

    public void moveCar(int movingNumber) {
        this.distance+=movingNumber;
    }
}
