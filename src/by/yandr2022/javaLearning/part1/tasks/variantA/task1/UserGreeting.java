package by.yandr2022.javaLearning.part1.tasks.variantA.task1;


public class UserGreeting {

    public static void main(String[] args) {

        if (args != null && args.length == 1) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Invalid argument, enter your name after the class name");
        }
    }
}
