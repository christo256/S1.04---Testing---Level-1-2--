package task3_S1_04_Testing_Level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AssertionArraysAreTheSame {
    @Test
    void arraysAreTheSame() {

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6};

        assertThat(array1).isEqualTo(array2);
    }
}
