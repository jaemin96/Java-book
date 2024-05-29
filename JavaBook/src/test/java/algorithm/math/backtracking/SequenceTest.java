package algorithm.math.backtracking;

import algorithm.basic.math.backtracking.SequenceByNatural;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceTest {
    @Nested
    @DisplayName("Sequence by natural number")
    class SequenceByNaturalNumber {
        int N,M;
        SequenceByNatural sbn;

        @BeforeEach
        void setup() {
            N = 3;
            M = 3;
            sbn = new SequenceByNatural();
        }

        @Test
        @DisplayName("it check number of cases")
        void numberOfCases() {
            int expected = 6;
            int actual = this.sbn.sequenceCheckCases(this.N, this.M);
            Assertions.assertEquals(expected,actual);
        }

        @Test
        @DisplayName("it check if the lists match")
        void matchLists() {
            List<List<Integer>> results = new ArrayList<>();
            results.add(Arrays.asList(1,2,3));
            results.add(Arrays.asList(1,3,2));
            results.add(Arrays.asList(2,1,3));
            results.add(Arrays.asList(2,3,1));
            results.add(Arrays.asList(3,1,2));
            results.add(Arrays.asList(3,2,1));

            List<List<Integer>> actual = this.sbn.sequenceCheck(this.N, this.M);

            System.out.print("Expected list: ");
            System.out.print(List.of(results));

            System.out.println();

            System.out.print("actual list: ");
            System.out.print(List.of(actual));

            Assertions.assertArrayEquals(results.toArray() ,actual.toArray());
        }

        @Test
        @DisplayName("it checks number of cases allowing duplicate numbers")
        void numberOfCasesAllowDuplicate() {
            int expected = 27;
            int actual = this.sbn.sequenceCheckCasesIsDuplicate(this.N, this.M);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        @DisplayName("it check if the lists match allowing duplicate numbers")
        void matchListsAllowDuplicate() {
            List<List<Integer>> results = new ArrayList<>();
            results.add(Arrays.asList(1,1,1));
            results.add(Arrays.asList(1,1,2));
            results.add(Arrays.asList(1,1,3));
            results.add(Arrays.asList(1,2,1));
            results.add(Arrays.asList(1,2,2));
            results.add(Arrays.asList(1,2,3));
            results.add(Arrays.asList(1,3,1));
            results.add(Arrays.asList(1,3,2));
            results.add(Arrays.asList(1,3,3));
            results.add(Arrays.asList(2,1,1));
            results.add(Arrays.asList(2,1,2));
            results.add(Arrays.asList(2,1,3));
            results.add(Arrays.asList(2,2,1));
            results.add(Arrays.asList(2,2,2));
            results.add(Arrays.asList(2,2,3));
            results.add(Arrays.asList(2,3,1));
            results.add(Arrays.asList(2,3,2));
            results.add(Arrays.asList(2,3,3));
            results.add(Arrays.asList(3,1,1));
            results.add(Arrays.asList(3,1,2));
            results.add(Arrays.asList(3,1,3));
            results.add(Arrays.asList(3,2,1));
            results.add(Arrays.asList(3,2,2));
            results.add(Arrays.asList(3,2,3));
            results.add(Arrays.asList(3,3,1));
            results.add(Arrays.asList(3,3,2));
            results.add(Arrays.asList(3,3,3));

            List<List<Integer>> actual = this.sbn.sequenceCheckIsDuplicate(this.N, this.M);

            System.out.print("Expected list: ");
            System.out.print(List.of(results));

            System.out.println();

            System.out.print("actual list: ");
            System.out.print(List.of(actual));

            Assertions.assertArrayEquals(results.toArray(), actual.toArray());
        }
    }
}
