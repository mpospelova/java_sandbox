public class CamelCase {
    //TODO: refactor
    public static String camelCase(String str) {
        StringBuffer buffer = new StringBuffer();
        int firstIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            int secondIndex;
            char c = str.charAt(i);

            if(i == 0 && c == ' ' || c == ' ' && str.charAt(i - 1) == ' ') {
                firstIndex++;
                continue;
            } else if (c == ' ' || i == str.length() - 1) {
                secondIndex = c == ' ' ? i : i + 1;
                String temp = str.substring(firstIndex, secondIndex);
                buffer.append(temp.substring(0, 1).toUpperCase());
                buffer.append(temp.substring(1));

                firstIndex = secondIndex + 1;
            }
        }
        return buffer.toString();
    }
}
