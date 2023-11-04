package by.yandr2022.javaLearning.part1.tasks.variantA.task3;

import java.io.IOException;
import java.util.Random;

public class RandomNumbersPrinter {
    private static final Random random = new Random();
    private int minGeneratedNumber;
    private int maxGeneratedNumber;

    public RandomNumbersPrinter(int minGeneratedNumber, int maxGeneratedNumber) throws IOException {
        if (minGeneratedNumber >= 0 && maxGeneratedNumber > minGeneratedNumber) {
            this.minGeneratedNumber = minGeneratedNumber;
            this.maxGeneratedNumber = maxGeneratedNumber;
        } else {
            throw new IOException("Wrong parameters");
        }
    }

    public int getMinGeneratedNumber() {
        return minGeneratedNumber;
    }

    public void setMinGeneratedNumber(int minGeneratedNumber) throws IOException {
        if (minGeneratedNumber >= 0) {
            this.minGeneratedNumber = minGeneratedNumber;
        } else {
            throw new IOException("Minimal number's bound must be positive");
        }
    }

    public int getMaxGeneratedNumber() {
        return maxGeneratedNumber;
    }

    public void setMaxGeneratedNumber(int maxGeneratedNumber) throws IOException {
        if (maxGeneratedNumber > minGeneratedNumber) {
            this.maxGeneratedNumber = maxGeneratedNumber;
        } else {
            throw new IOException("Maximal number's bound must be greater than minimal");
        }
    }

    private int[] generateNumbers(int amount) {
        int[] result = new int[amount];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(maxGeneratedNumber - minGeneratedNumber) + minGeneratedNumber;
        }
        return result;
    }

    public void printRandomNumbers(int amount, String separator) {
        int[] randomNumbers = generateNumbers(amount);
        for (int n : randomNumbers) {
            System.out.printf("%d%s", n, separator);
        }

    }
}
