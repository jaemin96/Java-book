package algorithm.math.set;

import algorithm.basic.math.set.SymmetricDiffExam;
import algorithm.math.testUtil.EqualsUtil;
import algorithm.math.testUtil.MapUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SymmetricDiffTest {
    @Test
    public void SymmetricTest() {
        MapUtil mu = new MapUtil();
        EqualsUtil eu = new EqualsUtil();
        SymmetricDiffExam sd = new SymmetricDiffExam();

        // Base
        List<Map<String,String>> A = new ArrayList<>();
        A.add(mu.mapping("KOREA","KOREA"));
        A.add(mu.mapping("USA","USA"));
        A.add(mu.mapping("SWISS","SWISS"));

        List<Map<String,String>> B = new ArrayList<>();
        B.add(mu.mapping("KOREA","KOREA"));
        B.add(mu.mapping("USA","USA"));
        B.add(mu.mapping("JAPAN","JAPAN"));
        B.add(mu.mapping("UK","UK"));
        B.add(mu.mapping("CHINA","CHINA"));

        // Expected
        List<Map<String, String>> expectedADiffB = new ArrayList<>();
        expectedADiffB.add(mu.mapping("SWISS","SWISS"));

        List<Map<String, String>> expectedBDiffA = new ArrayList<>();
        expectedBDiffA.add(mu.mapping("JAPAN","JAPAN"));
        expectedBDiffA.add(mu.mapping("UK","UK"));
        expectedBDiffA.add(mu.mapping("CHINA","CHINA"));

        int expectedCount = 4;

        // Actual
        List<Map<String, String>> actualADiffB = sd.symmetricDiff(A, B);
        List<Map<String, String>> actualBDiffA = sd.symmetricDiff(B, A);
        int actualCount = sd.getSymmetricDiffUnionCount(A, B);

        // Testing!
        Assertions.assertTrue(eu.isEqualsList(expectedADiffB, actualADiffB));
        Assertions.assertTrue(eu.isEqualsList(expectedBDiffA, actualBDiffA));
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
