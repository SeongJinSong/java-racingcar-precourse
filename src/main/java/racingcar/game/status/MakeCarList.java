package racingcar.game.status;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.game.GameContext;
import racingcar.view.port.outbound.StandardOutput;
import racingcar.view.status.EnterCarNameList;
import racingcar.view.status.EnterRetryCount;

public class MakeCarList implements Status {

    public static final String DELIMITER = ",";

    @Override
    public Status next(GameContext gameContext) {
        List<Car> carList = new ArrayList<>();
        try {
            makeCarList(gameContext.getCarNameList(), carList);
            gameContext.setCarList(carList);
            return new EnterRetryCount();
        } catch (IllegalArgumentException e) {
            StandardOutput.Error(e.getMessage());
            return new EnterCarNameList();
        }
    }

    private void makeCarList(String carNameList, List<Car> carList) {
        for (String name : carNameList.split(DELIMITER)) {
            carList.add(new Car(name));
        }
    }
}
