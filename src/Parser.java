import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Parser {


    public static int parseInt(String numStr) {
        String[]array = numStr.split(" ");
        Map<String, Integer> numbers = numbers();
        Map<String, Integer> specialNumbers = specialNumbers();
        int[] stack = new int[100];
        int stackIndex = 0;

        for(int i = 0; i < array.length; i++) {
            boolean regex = false;
            if(array[i].equals("and"))
                continue;

            for(int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == '-') {
                    stack[stackIndex] += numbersWithSign(array[i]);
                    regex = true;
                }
            }

            if(!numbers.containsKey(array[i]) && !specialNumbers.containsKey(array[i]) && !regex)
                return -1;

            if(numbers.containsKey(array[i])) {
                stack[stackIndex] += numbers.get(array[i]);
            } else if(specialNumbers.containsKey(array[i])) {
                stack[stackIndex] *= specialNumbers.get(array[i]);
            }
            if(array[i].equals("million"))
                stackIndex++;
            if(array[i].equals("thousand")) {
                stackIndex++;
            }
        }
        return Arrays.stream(stack).sum();
    }

    private static int numbersWithSign(String string) {
        int result= 0;
        String[]array = string.split("-");
        for(int j = 0; j < array.length; j++)
            result += numbers().get(array[j]);

        return result;
    }

    private static Map<String, Integer> numbers() {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("zero", 0); numbers.put("one", 1); numbers.put("two", 2);
        numbers.put("three", 3); numbers.put("four", 4); numbers.put("five", 5);
        numbers.put("six", 6); numbers.put("seven", 7); numbers.put("eight", 8);
        numbers.put("nine", 9); numbers.put("ten", 10); numbers.put("eleven", 11);
        numbers.put("twelve", 12); numbers.put("thirteen", 13); numbers.put("fourteen", 14);
        numbers.put("fifteen", 15); numbers.put("sixteen", 16); numbers.put("seventeen", 17);
        numbers.put("eighteen", 18); numbers.put("nineteen", 19); numbers.put("twenty", 20);
        numbers.put("thirty", 30); numbers.put("forty", 40); numbers.put("fifty", 50);
        numbers.put("sixty", 60); numbers.put("seventy", 70); numbers.put("eighty", 80);
        numbers.put("ninety", 90);
        return numbers;
    }
    private static Map<String, Integer> specialNumbers() {
        Map<String, Integer> specialNumbers = new HashMap<>();
        specialNumbers.put("hundred", 100); specialNumbers.put("thousand", 1000);
        specialNumbers.put("million", 1000000);
        return specialNumbers;
    }

}
