package racingcar.game.status;

import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.Referee;
import racingcar.game.GameContext;
import racingcar.view.port.outbound.StandardOutput;

public class GameResult implements Status {

    public static final String RESULT_PREFIX = "최종 우승자 : ";

    @Override
    public Status next(GameContext gameContext) {
        List<Car> winnerList = gameContext.judge(gameContext.getCarList());
        StandardOutput.println(RESULT_PREFIX + makeResult(winnerList));
        return new Exit();
    }

    private String makeResult(List<Car> winnerList) {
        StringBuilder sb = new StringBuilder();
        for (Car car : winnerList) {
            sb.append(car.getCarName().getName()).append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
