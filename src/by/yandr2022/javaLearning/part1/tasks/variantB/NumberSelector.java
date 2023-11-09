package by.yandr2022.javaLearning.part1.tasks.variantB;

import java.util.Arrays;

public class NumberSelector {

    public static int[] getNumbersByEven(boolean even, int... numbers) {
        int[] matchNumbers = new int[numbers.length];
        int j = 0;
        for (int number : numbers) {
            if (number % 2 == 0 ^ !even) {
                matchNumbers[j++] = number;
            }
        }
        return Arrays.copyOf(matchNumbers, j);
    }

    public static int getMinNumber(int... numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int getMaxNumber(int... numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int[] getDivisibleNumber(int divisor, int... numbers) {
        int[] matchNumbers = new int[numbers.length];
        int j = 0;
        for (int number : numbers) {
            if (number % divisor == 0) {
                matchNumbers[j++] = number;
            }
        }
        return Arrays.copyOf(matchNumbers, j);
    }

    public static int[] getThreeDigitNumbersWithoutSameDigit(int... numbers) {
        int[] matchNumbers = new int[numbers.length];
        int j = 0, firstDigit, thirstDigit, secondDigit;
        for (int number : numbers) {
            if (Math.abs(number) > 99 && Math.abs(number) < 1000) {
                firstDigit = number / 100;
                secondDigit = (number / 10) % 10;
                thirstDigit = number % 10;
                if (firstDigit != thirstDigit && firstDigit != secondDigit && secondDigit != thirstDigit) {
                    matchNumbers[j++] = number;
                }
            }
        }
        return Arrays.copyOf(matchNumbers, j);
    }

    public static int[] getPrimeNumbers(int... numbers) {
        int[] matchNumbers = new int[numbers.length];
        int j = 0;
        boolean isPrime;
        for (int number : numbers) {
            isPrime = number > 1;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                matchNumbers[j++] = number;
            }

        }
        return Arrays.copyOf(matchNumbers, j);
    }

    public static int[] getPalindromes(int... numbers) {
        int[] matchNumbers = new int[numbers.length];
        int j = 0;
        boolean isPalindrome;
        for (int number : numbers) {
            isPalindrome = number > 9;
            if (isPalindrome) {
                char[] digits = Integer.toString(number).toCharArray();
                for (int i = 0; i < digits.length / 2; i++) {
                    if (digits[i] != digits[digits.length - 1 - i]) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    matchNumbers[j++] = number;
                }
            }

        }
        return Arrays.copyOf(matchNumbers, j);
    }

    public static int[] getNumbersEqualHalfSumNeighbors(int... numbers) {
        int[] matchNumbers = new int[numbers.length];
        int j = 0;
        boolean isPalindrome;
        for (int number : numbers) {
            isPalindrome = number > 9;
            if (isPalindrome) {
                char[] digits = Integer.toString(number).toCharArray();
                for (int i = 0; i < digits.length / 2; i++) {
                    if (digits[i] != digits[digits.length - 1 - i]) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    matchNumbers[j++] = number;
                }
            }

        }
        return Arrays.copyOf(matchNumbers, j);
    }


    /* TODO  lucky numbers */
}

