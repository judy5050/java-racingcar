package racinggame.domain;

public class Car {

    private static final int GO_POSSIBLE_VALUE = 4;

    private final String carName;
    private int location;

    public Car(String carName, int location) {
        this.carName = carName;
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    public String getCarName() {
        return carName;
    }

    public void move(Integer integer) {
        if (integer >= GO_POSSIBLE_VALUE) {
            location++;
        }
    }
}
