package racingcar.ui;

import racingcar.domain.CarDTO;

import java.util.List;
import java.util.Map;

public class ResultView {
    private static final int FIRST = 0;

    public void showRacingResult(Map<Integer, List<CarDTO>> racingResult) {
        for (List<CarDTO> result  : racingResult.values()) {
            showCarPosition(result);
        }
    }

    private void showCarPosition(List<CarDTO> result) {
        for (CarDTO carDTO : result) {
            System.out.println(
                    new StringBuilder().append(carDTO.getName())
                            .append(" : ")
                            .append(carDTO.getPosition())
            );
        }
        System.out.println();
        System.out.println();
    }

    public void show(List<CarDTO> winners) {
        if (winners == null || winners.isEmpty()) {
            throw new IllegalArgumentException("우승자가 없습니다.");
        }

        StringBuilder sb = new StringBuilder();
        sb.append("우승자는 ").append(winners.get(FIRST).getName());
        for (int index=1; index<winners.size(); index++) {
            sb.append(',').append(winners.get(index).getName());
        }
        sb.append(" 입니다. ");

        System.out.println(sb.toString());
    }
}
