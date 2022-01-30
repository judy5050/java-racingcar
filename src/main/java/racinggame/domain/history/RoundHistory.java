package racinggame.domain.history;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racinggame.domain.car.Car;
import racinggame.domain.car.Cars;
import racinggame.domain.history.CarHistory;

public class RoundHistory {

    private final List<CarHistory> carHistories;

    public RoundHistory(final List<CarHistory> carHistoryList) {
        this.carHistories = carHistoryList;
    }

    public List<CarHistory> getRoundHistory() {
        return new ArrayList<>(carHistories);
    }
}
