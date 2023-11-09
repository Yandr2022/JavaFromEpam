package by.yandr2022.javaLearning.part1.tasks.variantB;

import java.util.Arrays;

public class Controller {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 7, 2, 3, 5, 2002, 33, 9, 388, 12, -4, 4, 0, -1024, 18, 80, 11, 21, 140, 323, 872, 777};
        System.out.println(Arrays.toString(NumberSelector.getNumbersByEven(true, arr)));
        System.out.println(Arrays.toString(NumberSelector.getNumbersByEven(false, arr)));
        System.out.println(NumberSelector.getMinNumber(arr));
        System.out.println(NumberSelector.getMaxNumber(arr));
        System.out.println(Arrays.toString(NumberSelector.getDivisibleNumber(3, arr)));
        System.out.println(Arrays.toString(NumberSelector.getDivisibleNumber(9, arr)));
        System.out.println(Arrays.toString(NumberSelector.getDivisibleNumber(5, arr)));
        System.out.println(Arrays.toString(NumberSelector.getDivisibleNumber(7, arr)));
        System.out.println(Arrays.toString(NumberSelector.getThreeDigitNumbersWithoutSameDigit(arr)));
        System.out.println(Arrays.toString(NumberSelector.getPrimeNumbers(arr)));
        System.out.println(Arrays.toString(NumberSorter.getNumbersByAscending(arr)));
        System.out.println(Arrays.toString(NumberSorter.getNumbersByDescending(arr)));
        System.out.println(Arrays.toString(NumberSelector.getPalindromes(arr)));


    }
}
