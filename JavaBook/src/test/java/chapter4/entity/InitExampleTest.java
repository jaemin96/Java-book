package chapter4.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitExampleTest {
    byte byte_value;
    int int_value;
    short short_value;
    long long_value;
    float float_value;
    double double_value;
    boolean bool_value;
    @Test
    public void initTest() {
        InitExampleTest Init = new InitExampleTest();

        assertEquals(0,Init.byte_value);
        assertEquals(0,Init.int_value);
        assertEquals(0,Init.short_value);
        assertEquals(0,Init.long_value);
        assertEquals(0,Init.float_value);
        assertEquals(0,Init.double_value);
        assertEquals(false,Init.bool_value);
    }
}
