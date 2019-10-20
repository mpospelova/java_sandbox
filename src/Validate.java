public class Validate {
    //TODO: refactor

    public static boolean validate(String n) {
        int[] array = new int[n.length()];
        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            array[i] = n.charAt(i) - '0';

            if (n.length() % 2 == 0 && i % 2 == 0) {
                    array[i] *= 2;
            } else if (n.length() % 2 != 0 && i % 2 != 0)
                    array[i] *= 2;

            if (array[i] > 9)
                array[i] -= 9;

            sum += array[i];
        }

        return sum % 10 == 0;
    }
}
