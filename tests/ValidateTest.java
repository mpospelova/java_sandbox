import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {

    @Test
    void validate() {
        assertEquals(false, Validate.validate("891"));
    }
}