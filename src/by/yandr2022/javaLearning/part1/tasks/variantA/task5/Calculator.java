package by.yandr2022.javaLearning.part1.tasks.variantA.task5;

import java.util.Arrays;

public class Calculator {


    public static void main(String[] args) {
        printResult(convertStringToNumbers(args));
    }

    private static int getSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static int getMultiplying(int... numbers) {
        int mpl = 1;
        for (int num : numbers) {
            mpl *= num;
        }
        return mpl;
    }

    private static int[] convertStringToNumbers(String[] inputStrings) {
        String[] validatedStrings = removeIncorrectValues(inputStrings);
        int[] result = new int[validatedStrings.length];
        for (int i = 0; i < result.length; i++) {
            {
                result[i] = Integer.parseInt(validatedStrings[i]);
            }
        }
        return result;
    }

    private static String[] removeIncorrectValues(String[] rawArray) {
        String[] correctStrings = new String[rawArray.length];
        int i = 0, j = 0;
        while (i < rawArray.length) {
            if (rawArray[i].matches("-?\\d*")) {
                correctStrings[j++] = rawArray[i];
            }
            i++;
        }
        return Arrays.copyOf(correctStrings, j);
    }

    private static void printResult(int[] numbers) {
        System.out.printf("numbers: %s\nsum = %d\nmultiplying = %d", Arrays.toString(numbers)
                , getSum(numbers), getMultiplying(numbers));
    }
}
