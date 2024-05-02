package algorithm.math.sort;

import algorithm.basic.math.sort.SortExam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest {
    @Test
    public void sortTesting() {
        SortExam se = new SortExam();
        int[] array1 = {11,3,2,8,4,12};
        int[] array2 = {5,14,1,9,6,3};

        int[] expectedAsc = {2,3,4,8,11,12};
        int[] actualAsc = se.sortByASC(array1);

        int[] expectedDesc = {14,9,6,5,3,1};
        int[] actualDesc = se.sortByDESC(array2);

        Assertions.assertArrayEquals(expectedAsc, actualAsc);
        Assertions.assertArrayEquals(expectedDesc, actualDesc);
    }
}
