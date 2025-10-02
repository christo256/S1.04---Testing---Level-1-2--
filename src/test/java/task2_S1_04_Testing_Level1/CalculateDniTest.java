package task2_S1_04_Testing_Level1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import task2_S1_04_Level1.CalculateDni;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "44444444, A",
            "55555555, K",
            "66666666, Q",
            "77777777, B",
            "88888888, Y",
            "99999999, R"
    })
    void testCalculateDNI(int dniNumber, char expectedLetter) {
        char result = CalculateDni.calculateDni(dniNumber);
        assertEquals(expectedLetter, result);
    }

    @Test
    void testCalculateDni_negativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculateDni.calculateDni(-12345678);
        });
    }

    @Test
    void testCalculateDni_numberTooLarge() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculateDni.calculateDni(100000000);
        });
    }
}





