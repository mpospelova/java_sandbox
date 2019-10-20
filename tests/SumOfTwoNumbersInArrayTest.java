import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoNumbersInArrayTest {

    @Test
    void twoSum() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int sum = 11;
        int[] result = SumOfTwoNumbersInArray.twoSum(array, sum);
        assertEquals(2, result.length);
        assertEquals(11, array[result[0]] + array[result[1]]);
    }

    @Test
    public void basicTests()
    {
        doTest(new int[]{1,2,3},          new int[]{0,2});
        doTest(new int[]{1234,5678,9012}, new int[]{1,2});
        doTest(new int[]{2,2,3},          new int[]{0,1});
    }
    private void doTest(int[] numbers, int[] expected)
    {
        int target = numbers[expected[0]] + numbers[expected[1]];
        int[] actual = SumOfTwoNumbersInArray.twoSum(numbers, target);
        if ( null == actual )
        {
            System.out.format("Received a null\n");
            assertNotNull(actual);
        }
        if ( actual.length != 2 )
        {
            System.out.format("Received an array that's not of length 2\n");
            assertTrue(false);
        }
        int received = numbers[actual[0]] + numbers[actual[1]];
        assertEquals(target, received);
    }

}