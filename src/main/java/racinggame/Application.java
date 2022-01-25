package racinggame;

import java.util.List;
import java.util.Random;
import racinggame.domain.Car;
import racinggame.domain.Cars;
import racinggame.domain.GameInit;
import racinggame.domain.PlayRacingGame;
import racinggame.domain.Winner;
import racinggame.view.ResultView;

public class Application {

    public static void main(String[] args) {
        GameInit gameInit = new GameInit();
        ResultView resultView = new ResultView();
        PlayRacingGame playRacingGame = new PlayRacingGame();
        String[] carNames = gameInit.inputPlayerName();
        Cars cars = new Cars(carNames);

        int playGameNumber = gameInit.inputTryNumber();
        int maxLocation;
        List<Car> carList = cars.getCars();
        System.out.println("실행 결과");
        for (; playGameNumber > 0; playGameNumber--) {
            cars.move();
            resultView.printCarsLocation(cars);

        }

        maxLocation = cars.findMaxLocation();
        List<Winner> winnerList = playRacingGame.findWinner(carList, maxLocation);
        resultView.printWinner(winnerList);
    }

}
