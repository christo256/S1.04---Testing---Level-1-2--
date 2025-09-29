package task4_S1_04_Testing_Level2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MapTest {


    @Test
    void mapContainsKey() {

        Map<String, Integer> ages = new HashMap<>();

        ages.put("Juan", 35);
        ages.put("Ricardo", 28);


        assertThat(ages).containsKey("Juan");
        assertThat(ages).containsKeys("Juan", "Ricardo");
        System.out.println("Test passed correctly");
    }
}
