public class Keypad {
    public static int presses(String phrase) {
        String alphabet = "ABCDEFGHIJKLMNOPQRTUVWXY";
        String notPermitted = "!@#$%^&*()_+-={}|[]:;'/?.>,<`~";
        String numbers = "1234568";
        phrase = phrase.toUpperCase();
        int result = 0;

        for(int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if(c == 'S' || c == 'Z' || numbers.indexOf(c) > 0)
                result += 4;
            else if(c == ' ' || c == '*' || c == '#' || c == '1')
                result += 1;
            else if(notPermitted.indexOf(c) > 0)
                continue;
            else if(c == '9' || c == '7' )
                result += 5;
            else if( c == '0')
                result += 2;
            else
                result += (alphabet.indexOf(c) % 3) + 1;
        }
        return result;
    }

}
