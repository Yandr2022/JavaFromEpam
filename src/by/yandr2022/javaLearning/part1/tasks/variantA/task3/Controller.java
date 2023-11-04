package by.yandr2022.javaLearning.part1.tasks.variantA.task3;

import java.io.IOException;

public class Controller {

    public static void main(String[] args) {

        try {
            RandomNumbersPrinter printer = new RandomNumbersPrinter(5, 20);

            printer.printRandomNumbers(10, " ");
            printer.printRandomNumbers(5, "\n");

            printer.setMinGeneratedNumber(printer.getMinGeneratedNumber() - 3);
            printer.setMaxGeneratedNumber(12);

            printer.printRandomNumbers(10, "; ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
