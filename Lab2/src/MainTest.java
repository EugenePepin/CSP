import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    public void testAverageIndexOfMinMaxWithValidArray() {
        int[] array = {3, 5, 1, 8, 7};
        double expected = 2.5;
        assertEquals(expected, Main.averageOfMinMaxIndices(array));
    }

    @Test
    public void testAverageIndexOfMinMaxWithSingleElement() {
        int[] array = {10};
        double expected = 0.0;
        assertEquals(expected, Main.averageOfMinMaxIndices(array));
    }

}