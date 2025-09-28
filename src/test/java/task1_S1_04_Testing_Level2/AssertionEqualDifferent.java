package task1_S1_04_Testing_Level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AssertionEqualDifferent {

    @Test
    void testIntegerAreEquals() {
        int a = 10;
        int b = 10;

        assertThat(a).isEqualTo(b);
        System.out.println(a + " and " + b + " are equals. " + "Test passed correctly");
    }

    @Test
    void testIntegerAreNotEquals() {
        int a = 10;
        int b = 20;

        assertThat(a).isNotEqualTo(b);
        System.out.println(a + " and " + b + " are not equals. " + "Test passed correctly");
    }

}


