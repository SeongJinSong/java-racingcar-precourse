package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Referee {
    private final List<Car> winnerLIst = new ArrayList<>();

    public Referee(List<Car> carList) {
        int max = 0;
        for (Car car : carList) {
            max = Math.max(car.getLocation().getX(), max);
        }
        for (Car car : carList) {
            confirmWinner(car, max);
        }
    }

    private void confirmWinner(Car car, int max) {
        if (car.getLocation().getX() == max) {
            winnerLIst.add(car);
        }
    }

    public List<Car> getWinnerList() {
        return this.winnerLIst;
    }
}
