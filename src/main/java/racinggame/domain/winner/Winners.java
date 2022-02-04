package racinggame.domain.winner;

import java.util.ArrayList;
import java.util.List;
import racinggame.domain.car.Car;

public class Winners {

    private final List<Winner> winnerList = new ArrayList<>();

    public Winners(final List<Car> cars, final int maxLocation) {
        for (Car car : cars) {
            if (car.isInLocation(maxLocation)) {
                winnerList.add(new Winner(car.getCarName()));
            }
        }
    }

    public List<Winner> getWinners() {
        return new ArrayList<>(winnerList);
    }
}
