public class SumOfTwoNumbersInArray {
//TODO: refactor
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
            return result;
    }
}
