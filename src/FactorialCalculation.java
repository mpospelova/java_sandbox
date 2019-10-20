public class FactorialCalculation {
    public static int zeros(int n) {
        int result = 0;

        for(int i = 5; i/5 >= 1; i*=5)
            result += n/i;

        return result;
    }

}
