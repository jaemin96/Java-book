package algorithm.math.data;

import algorithm.basic.math.data.BracketsValidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BracketsTest {
    @Test
    public void bracketsTest() {
        BracketsValidation bv = new BracketsValidation();

        String str = "(1(33(23)6)5)(1231)()()";

        Assertions.assertTrue(bv.checkBrackets(str));
    }
}
