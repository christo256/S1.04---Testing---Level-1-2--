package task3_S1_04_Testing_level1;
import org.junit.jupiter.api.Test;
import task3_S1_04_Testing_Level1.ArrayException;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayExceptionTest {

    @Test
    void testTryingArrayIndexOutOfBoundsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class,
                ArrayException::gettingArrayIndexOutOfBoundsException);
        System.out.println("Test passed");
    }
}
