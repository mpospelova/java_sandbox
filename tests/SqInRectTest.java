import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SqInRectTest {

    @Test
    void sqInRect() {
        List<Integer> result = SqInRect.sqInRect(1, 1);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0));
    }

    @Test
    void sqInRect2() {
        List<Integer> result = SqInRect.sqInRect(1, 2);
        assertEquals(2, result.size());
        assertEquals(1, result.get(1));
    }

    @Test
    void sqInRect3() {
        List<Integer> result = SqInRect.sqInRect(1, 3);
        assertEquals(3, result.size());
        assertEquals(1, result.get(1));
    }

    @Test
    void sqInRect4() {
        List<Integer> result = SqInRect.sqInRect(3, 5);
        assertEquals(4, result.size());
    }
}