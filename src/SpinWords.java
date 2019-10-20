public class SpinWords {
//TODO:refactor
    public String spinWords(String sentence) {
        int firstPosition = 0;
        int secondPosition;
        StringBuffer buffer = new StringBuffer();

        for(int i = 0; i < sentence.length(); i++) {
            String substring = "";
            char c = sentence.charAt(i);

            if(c == ' ' || i == sentence.length() - 1) {
                if(c == ' ') {
                    secondPosition = i;
                } else
                    secondPosition = i + 1;

                substring = sentence.substring(firstPosition, secondPosition);

                if(secondPosition - firstPosition >= 5) {
                    substring = revert(substring);
                }

                if(c == ' ')
                    buffer.append(substring + " ");
                else
                    buffer.append(substring);

                firstPosition = secondPosition + 1;
            }
        }
        return buffer.toString();
    }

    private String revert(String word) {
        StringBuffer buffer = new StringBuffer();
        for(int i = word.length() - 1; i >= 0; i--) {
            buffer.append(word.charAt(i));
        }
        return buffer.toString();
    }

}
