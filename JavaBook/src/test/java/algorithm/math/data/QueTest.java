package algorithm.math.data;

import algorithm.basic.math.data.Que;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueTest {
    @Test
    public void queTest() {
        Que que = new Que();

        // 삽입 테스트 (push)
        que.push(3);
        que.push(4);
        que.push(1);
        // 큐가 비어있는 지 여부 확인 - false 면 비어있지 않다는 뜻
        Assertions.assertFalse(que.isQueEmpty());

        // 큐 사이즈 테스트 (getQueSize)
        int expectedQueSize = 3;
        Assertions.assertEquals(expectedQueSize, que.getQueSize());

        // 추출 테스트 (pop)
        int expectedPop = 3;
        Assertions.assertEquals(expectedPop, que.pop());

        // 큐 사이즈 테스트 (getQueSize)
        expectedQueSize = 2;
        Assertions.assertEquals(expectedQueSize, que.getQueSize());

        // 큐 front, last 값 검사
        que.push(12);
        que.push(5);
        que.push(8);
        int expectedFront = 4;
        int expectedLast = 8;
        Assertions.assertEquals(expectedFront, que.front());
        Assertions.assertEquals(expectedLast, que.last());

        // 큐 사이즈 테스트 (getQueSize)
        expectedQueSize = 5;
        Assertions.assertEquals(expectedQueSize, que.getQueSize());
    }
}
