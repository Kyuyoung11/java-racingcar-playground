package CarRacing.object;

import lombok.Getter;

@Getter
public class Car {
    String name;
    int distance;

    public Car() {

    }


    public Car(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }


    public void moveCar(int movingNumber) {
            this.distance+=movingNumber;
    }

    @Override
    public String toString() {
        StringBuilder distanceBuilder = new StringBuilder();
        for (int i=0; i<this.distance; i++)
            distanceBuilder.append('-');
        return name + " : " + distanceBuilder.toString();
    }
}
