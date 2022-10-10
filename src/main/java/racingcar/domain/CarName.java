package racingcar.domain;

public class CarName {

    public static final int CAR_NAME_MAX_SIZE = 5;
    private final String name;

    public CarName(String name) {
        if (name.length() > CAR_NAME_MAX_SIZE) {
            throw new IllegalArgumentException("차 이름을 5자 이하로 입력해 주세요.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
