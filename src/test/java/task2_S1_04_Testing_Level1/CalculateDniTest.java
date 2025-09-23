package task2_S1_04_Testing_Level1;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "11111111, A",
            "22222222, H",
            "33333333, G",
            "44444444, L",
            "55555555, R",
            "66666666, K",
            "77777777, Y",
            "88888888, Z",
            "99999999, C"
    })
    void testCalculateDNI(int dniNumber, char expectedLetter) {
        char result = CalculateDni.calculateDni(dniNumber);
        assertEquals(expectedLetter, result);
    }
}





