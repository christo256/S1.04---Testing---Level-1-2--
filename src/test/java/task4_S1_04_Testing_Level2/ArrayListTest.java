package task4_S1_04_Testing_Level2;

import org.junit.jupiter.api.Test;
import task4_S1_04_Level2.MyObjects;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void testArrayListAssertions() {

        String name = "Miguel";
        Integer number = 46;
        MyObjects obj1 = new MyObjects("object 1");
        MyObjects obj2 = new MyObjects("object 2");

        ArrayList<Object> list = new ArrayList<>();

        list.add(name);
        list.add(number);
        list.add(obj1);


        assertThat(list).containsExactly(name, number, obj1);

        assertThat(list).containsExactlyInAnyOrder(number, name, obj1);

        assertThat(list).doesNotHaveDuplicates();

        assertThat(list).doesNotContain(obj2);

    }

}
