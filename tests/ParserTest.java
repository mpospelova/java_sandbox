import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void test1() {
        assertEquals(1, Parser.parseInt("one"));
        assertEquals(50, Parser.parseInt("fifty"));
        assertEquals(12, Parser.parseInt("twelve"));
        assertEquals(100, Parser.parseInt("one hundred"));
        assertEquals(1001, Parser.parseInt("one thousand and one"));
        assertEquals(21, Parser.parseInt("twenty-one"));
        assertEquals(246, Parser.parseInt("two hundred forty-six"));
        assertEquals(2100, Parser.parseInt("two thousand one hundred"));
        assertEquals(100000, Parser.parseInt("one hundred thousand"));
        assertEquals(783919, Parser.parseInt("seven hundred eighty-three thousand nine hundred and nineteen"));
        assertEquals(1000000, Parser.parseInt("one million"));
        assertEquals(1000002, Parser.parseInt("one million and two"));
        assertEquals(1000088, Parser.parseInt("one million eighty-eight"));
        assertEquals(1000100, Parser.parseInt("one million and one hundred"));
        assertEquals(1000188, Parser.parseInt("one million one hundred eighty-eight"));
        assertEquals(1001000, Parser.parseInt("one million one thousand"));
        assertEquals(1100000, Parser.parseInt("one million one hundred thousand"));
        assertEquals(9999999, Parser.parseInt("nine million nine hundred ninty-nine thousand nine hundred ninty-nine"));
        assertEquals(99, Parser.parseInt("ninty-nine"));
    }

    @Test
    void testa() {
        assertEquals(29, Parser.parseInt("twenty-nine"));
        assertEquals(45, Parser.parseInt("forty-five"));
        assertEquals(28, Parser.parseInt("twenty-eight"));
        assertEquals(98, Parser.parseInt("ninety-eight"));

    }
}