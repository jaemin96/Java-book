package algorithm.math;

import algorithm.basic.math.search.SimultaneousEquations;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimulEquaTest {
    @Test
    public void EquationsTest(){
        int[] inputs = {1, 5, 12, 2, 1, 6};

        SimultaneousEquations se = new SimultaneousEquations();

        Map<String, Integer> result = se.findXY(inputs);

        assertEquals(2, result.get("x"));
        assertEquals(2, result.get("y"));
    }
}
