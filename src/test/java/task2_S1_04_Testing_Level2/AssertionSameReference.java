package task2_S1_04_Testing_Level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AssertionSameReference {
    @Test
    void testSameAndDiferentReference() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        Object obj3 = new Object();

        assertThat(obj1).isSameAs(obj2);
        System.out.println(obj1 + " is the same as: " + obj2 + " Test passed Correctly.");
        assertThat(obj2).isNotSameAs(obj3);
        System.out.println(obj2 + " is not the same as: " + obj3 + " Test passed Correctly.");
    }
}
