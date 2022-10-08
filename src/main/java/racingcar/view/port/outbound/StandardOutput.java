package racingcar.view.port.outbound;

import javax.naming.OperationNotSupportedException;

public class StandardOutput {
    private StandardOutput() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("인스턴스를 만들 수 없습니다.");
    }

    public static void println(final Object message) {
        System.out.println(message);
    }

    public static void print(final Object message) {
        System.out.print(message);
    }
}
