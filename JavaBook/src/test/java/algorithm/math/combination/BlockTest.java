package algorithm.math.combination;

import algorithm.basic.math.combination.BlockExam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlockTest {
    @Test
    public void blockTest() {
        BlockExam block = new BlockExam();
        int floor = 4;
        int expectedBlock = 20;
        int actualBlock = block.getTotalBlock(floor);
        Assertions.assertEquals(expectedBlock, actualBlock);

        int expectedPath = 16;
        int actualPath = block.getMovePathTotal(floor);
        Assertions.assertEquals(expectedPath, actualPath);
    }
}
