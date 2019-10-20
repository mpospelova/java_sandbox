import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpinWordsTest {

    @Test
    void spinWords0() {
        String string = "a";
        SpinWords spinWords = new SpinWords();
        String result = spinWords.spinWords(string);
        assertEquals("a", result);
    }

    @Test
    void spinWords1() {
        String string = "ab";
        SpinWords spinWords = new SpinWords();
        String result = spinWords.spinWords(string);
        assertEquals("ab", result);
    }

    @Test
    void spinWords2() {
        String string = "abc";
        SpinWords spinWords = new SpinWords();
        String result = spinWords.spinWords(string);
        assertEquals("abc", result);
    }

    @Test
    void spinWords3() {
        String string = "abcd";
        SpinWords spinWords = new SpinWords();
        String result = spinWords.spinWords(string);
        assertEquals("abcd", result);
    }
    @Test
    void spinWords4() {
        String string = "ab ab";
        SpinWords spinWords = new SpinWords();
        String result = spinWords.spinWords(string);
        assertEquals("ab ab", result);
    }

    @Test
    void spinWords5() {
        String string = "ab ab abc ab";
        SpinWords spinWords = new SpinWords();
        String result = spinWords.spinWords(string);
        assertEquals("ab ab abc ab", result);
    }

    @Test
    void spinWords6() {
        String string = "abcd abc abc a";
        SpinWords spinWords = new SpinWords();
        String result = spinWords.spinWords(string);
        assertEquals("abcd abc abc a", result);
    }

    @Test
    void spinWords7() {
        String string = "abcde";
        SpinWords spinWords = new SpinWords();
        String result = spinWords.spinWords(string);
        assertEquals("edcba", result);
    }

    @Test
    void spinWords8() {
        String string = "ab abcde";
        SpinWords spinWords = new SpinWords();
        String result = spinWords.spinWords(string);
        assertEquals("ab edcba", result);
    }

    @Test
    void spinWords9() {
        String string = "This is an another test";
        SpinWords spinWords = new SpinWords();
        String result = spinWords.spinWords(string);
        assertEquals("This is an rehtona test", result);
    }
    @Test
    void spinWords10() {
        String string = "Hey fellow warriors";
        SpinWords spinWords = new SpinWords();
        String result = spinWords.spinWords(string);
        assertEquals("Hey wollef sroirraw", result);
    }

    @Test
    void spinWords11() {
        String string = "Welcome";
        SpinWords spinWords = new SpinWords();
        String result = spinWords.spinWords(string);
        assertEquals("emocleW", result);
    }
}