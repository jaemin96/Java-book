package chapter3.address;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressEqualExampleTest {
    @Test
    public void equalTest() {
        String val1 = "ABC";
        String val2 = "ABC";
        String val3 = new String("ABC");

        assertEquals(true, val1==val2);
        assertEquals(false, val1==val3);
        assertEquals(true, val1.equals(val3));

        String[] arrays = new String[3];
        arrays[0] = "ABC";
        arrays[1] = "ABC";
        arrays[2] = new String("ABC");

        assertEquals(true, arrays[0] == arrays[1]);
        assertEquals(true, val1 == arrays[1]);
        assertEquals(true, val3.equals(arrays[2]));
        assertEquals(true, val1.equals(arrays[1]));
    }
}
