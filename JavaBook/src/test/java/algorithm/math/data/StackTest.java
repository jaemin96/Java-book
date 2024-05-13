package algorithm.math.data;

import algorithm.basic.math.data.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    public void stackTest() {
        Stack s = new Stack();

        s.push(1);
        s.push(3);
        s.push(4);

        // 스텍 비어있는 지 확인 (push test - 값이 잘 들어가는지)
        Assertions.assertFalse(s.isStackEmpty());

        // 스텍이 비어있지 않은 경우 - 스텍의 사이즈 비교 테스트
        int expectedStackSize = 3;
        int actualStackSize = s.getStackSize();
        Assertions.assertEquals(expectedStackSize, actualStackSize);

        // pop 테스트
        int expectedPop = 4;
        int actualPop = s.pop();
        Assertions.assertEquals(expectedPop, actualPop);
        actualPop = s.pop();
        Assertions.assertEquals(1, s.getStackSize());
        actualPop = s.pop();
        actualPop = s.pop();
        Assertions.assertEquals(-1, actualPop);
    }
}
