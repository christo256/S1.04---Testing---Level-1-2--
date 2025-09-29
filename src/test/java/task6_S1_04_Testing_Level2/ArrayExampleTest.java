package task6_S1_04_Testing_Level2;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import task6_S1_04_Level2.ArrayException;

public class ArrayExampleTest {

    @Test
    public void testArrayIndexOutOfBoundsException() {

        ArrayException arrayException = new ArrayException();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayException.getElementAt(12);
        });

    }
}
