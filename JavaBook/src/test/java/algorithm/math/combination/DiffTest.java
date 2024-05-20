package algorithm.math.combination;

import algorithm.basic.math.combination.DiffExam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiffTest {
    @Test
    public void diffTest() {
        DiffExam df = new DiffExam();
        int N = 6;

        // 경우의 수 산출 공식과 실제로 반복을 통해 산출하는 방식의 결과를 비교
        Assertions.assertEquals(df.getDiffCount(N), df.getDiffOrigin(N));
    }
}
