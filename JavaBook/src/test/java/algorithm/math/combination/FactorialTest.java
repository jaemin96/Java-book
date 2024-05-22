package algorithm.math.combination;

import algorithm.basic.math.combination.FactorialExam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
  @Test
  public void factorialTest() {
      FactorialExam factor = new FactorialExam();

      int n = 0;
      int expectedValue = 1;
      int actualValue = factor.factorial(n);

      Assertions.assertEquals(expectedValue, actualValue);
  }
}
