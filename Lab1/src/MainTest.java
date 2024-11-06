import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test

    void generateRandomArray() {
        int size = 10;
        int[] result = Main.generateRandomArray(size);
        assertNotNull(result);
        assertEquals(size, result.length);
    }

    @org.junit.jupiter.api.Test
    void countNegativeElements() {
        int[] testArray = { -5, 10, -15, 20, -25, 30 };
        int result = Main.countNegativeElements(testArray);
        assertEquals(3, result);
    }

    @org.junit.jupiter.api.Test
    void sumAfterMinAbsElement() {
        int[] testArray = { 50, -2, -5, 10, -1, 20 };
        int result = Main.sumAfterMinAbsElement(testArray);
        assertEquals(20, result);  // Мінімальний за модулем елемент -1, після нього сума 20
    }
}