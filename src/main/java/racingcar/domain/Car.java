package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final CarName carName;
    private final Move move;
    private final Location location;

    public Car(String name) {
        this.carName = new CarName(name);
        this.location = new Location();
        this.move = new Move();
    }

    public boolean play() {
        move.execute(Randoms.pickNumberInRange(1, 9));
        location.apply(move.isMoved());
        return move.isMoved();
    }
}
