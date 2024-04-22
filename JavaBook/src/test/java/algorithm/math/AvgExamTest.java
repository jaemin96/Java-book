package algorithm.math;

import algorithm.basic.math.AvgExample;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvgExamTest {
    @Test
    public void avgExamTest() {
        String input = "3\n80 90 70\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        AvgExample.main(new String[]{});

        double Max = 90.0;
        double expectedAvgScore = ((80.0/Max)*100 + (90.0/Max)*100 + (70.0/Max)*100) / 3;

        assertEquals(expectedAvgScore, AvgExample.total/3);
    }
}
