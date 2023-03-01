package arrays;

import java.util.Arrays;

public class ArrayMain {


    public static void main(String[] args) {
        // {1, 4, 2, 5, 8}, 54

        // calculate the arry items sum
        // compare arry item sum with provided sum variable
        // .  if array item sum bigger sum we are done.
        // .  else locate the minimum value item
        // .       add 1
        // .       recalculate

        int[] array = {2, 4, 2, 5, 8};
        int sum = 58;

        int arraySum = calculateArraySum(array);

        while (!isArraySumBiggerThanSum(arraySum, sum)) {
            addOneToTheLowestArrayItemValue(array);
            arraySum = calculateArraySum(array);
        }

        for (int item: array) {
            System.out.print(item + ", ");
        }
    }

    static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int item: array) {
            sum += item;
        }

        return sum;
    }

    static boolean isArraySumBiggerThanSum(int arraySum, int sum) {
        return arraySum > sum;
    }

    static void addOneToTheLowestArrayItemValue(int[] array) {
        int lowestItemIndex = 0;
        // {0, 1, 2, 3, 4};
        // {1, 4, 2, 5, 8};
        // calculates the position for the smallest item in the array
        for (int i = 1; i < array.length ; i++) {
            if (array[i] < array[lowestItemIndex]) {
                lowestItemIndex = i;
            }
        }

        array[lowestItemIndex] = array[lowestItemIndex] + 1;

    }


}
