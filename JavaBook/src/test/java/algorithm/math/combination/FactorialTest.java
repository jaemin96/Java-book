package algorithm.math.combination;

import algorithm.basic.math.combination.FactorialExam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class FactorialTest {
  @Test
  public void factorialTest() {
      FactorialExam factor = new FactorialExam();

      int n = 3;
      int expectedValue = 6;
      BigInteger actualValue = factor.factorial(n);

      Assertions.assertEquals(new BigInteger(expectedValue+""), actualValue);
  }
}
