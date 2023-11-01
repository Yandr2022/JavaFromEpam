package by.yandr2022.javaLearning.part1.tasks.variantA.task2;

public class BackArgumentsPrinter {

    public static void main(String[] args) {

        if (args != null && args.length > 0) {
            for (int i = args.length - 1; i >= 0; i--) {
                System.out.print(args[i] + " ");
            }
        } else {
            System.out.println("No arguments entered");
        }
    }
}
