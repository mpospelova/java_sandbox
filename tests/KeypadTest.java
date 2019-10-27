import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeypadTest {

    @Test
    public void simpleTest() {
//        assertEquals(9, Keypad.presses("LOL"));
//        assertEquals(13, Keypad.presses("HOW R U"));
//        assertEquals(22, Keypad.presses("XtUEfvrhrp"));
        assertEquals(47, Keypad.presses("WHERE DO U WANT 2 MEET L8R"));
    }

}