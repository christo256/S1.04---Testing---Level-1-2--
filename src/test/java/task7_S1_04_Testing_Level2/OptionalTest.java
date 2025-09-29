package task7_S1_04_Testing_Level2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class OptionalTest {
    @Test
    public void optionalTestIsEmpty() {

        Optional<Integer> emptyOptional = Optional.empty();

        assertTrue(emptyOptional.isEmpty());
    }
}
