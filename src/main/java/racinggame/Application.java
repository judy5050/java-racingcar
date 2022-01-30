package racinggame;

import racinggame.domain.history.RoundHistories;
import racinggame.domain.car.Cars;
import racinggame.domain.random.RandomGenerator;
import racinggame.view.InputView;
import racinggame.view.ResultView;

public class Application {

    public static void main(String[] args) {

        final InputView inputView = new InputView();
        final Cars cars = initCars(inputView);

        final RoundHistories roundHistories = race(inputView, cars);
        printResult(cars, roundHistories);
    }

    private static void printResult(Cars cars, RoundHistories roundHistories) {
        final ResultView resultView = new ResultView();
        resultView.printCarsLocation(roundHistories.getAllRoundHistory());
        resultView.printWinner(cars.getWinners());
    }

    private static RoundHistories race(InputView inputView, Cars cars) {
        final RandomGenerator randomGenerator = new RandomGenerator();
        final int playGameNumber = inputView.inputTryNumber();
        final RoundHistories roundHistories = new RoundHistories();
        for (int i=0; i<playGameNumber; i++) {
            cars.move(randomGenerator);
            roundHistories.captureRoundHistory(cars);
        }
        return roundHistories;
    }

    private static Cars initCars(InputView inputView) {
        final String[] carNames = inputView.inputPlayerName();
        final Cars cars = new Cars(carNames);
        return cars;
    }

}
