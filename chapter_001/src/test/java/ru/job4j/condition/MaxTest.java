package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax4To2Then4() {
        Max max = new Max();
        int result = max.max(4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void when3Equally3Then3() {
        Max max = new Max();
        int result = max.max(3, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whichOfTheThreeNumbersIsGreater() {
        Max maximum = new Max();
        int result = maximum.max(1, 2, 3);
        int expected = 3;
        assertThat(result, is(expected));
    }
    @Test
    public void whichOfTheFourNumbersIsGreater() {
        Max max = new Max();
        int result = max.max(1, 2, 3, 4);
        int expected = 4;
        assertThat(result, is(expected));
    }
}
