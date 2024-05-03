package algorithm.math.sort;

import algorithm.basic.math.sort.WordSortExam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordSortTest {
    @Test
    public void wordSortTest() {
        WordSortExam ws = new WordSortExam();
        String[] array = {"c", "azw", "ae", "abc", "haha"};

        String[] expectedArray = {"c", "ae", "abc", "azw", "haha"};
        String[] actualArray = ws.sortingWord(array);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }
}
