package chapter2.operation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class DetailCalcTest {
    @Test
    public void detailCalcTest() {
        int total = 1;
        double diff = 0.2;
        int count = 3;

        // 부동소수점 타입인 float와 double은 0.1을 정확하게 계산하지 않는다.
        // 따라서 1 - 0.6은 0.4가 나올 것 같지만 실제로는 0.3999999 와 같은 0.4와 근사한 값을 나타낸다.

        // assertEquals(0.4, total - diff*count); error!

        // sol) 부동소수점을 정수형으로 변환한 후 계산을 진행하고 부동소수점 타입으로 변경한다.
        double result = (total*10 - (int)(diff*10) * 3) / 10.0;
        assertEquals(0.4, result);
    }
}
