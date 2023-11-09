package by.yandr2022.javaLearning.part1.tasks.variantB;


import java.util.function.ToDoubleBiFunction;

public class NumberSorter {

    public static int[] getNumbersByAscending(int... numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0, temp; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

    public static int[] getNumbersByDescending(int... numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0, temp; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
    /* TODO  numbers in order of increasing frequency*/


}

