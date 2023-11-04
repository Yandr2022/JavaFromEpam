package by.yandr2022.javaLearning.part1.tasks.variantA.task4;

public class PasswordChecker {
    private static final String ORIGINAL_PASSWORD = "123ABC";
    private static final String MSG_CORRECT_PASSWORD = "Right password, welcome";
    private static final String MSG_WRONG_PASSWORD = "Wrong password, try again please";

    public static void main(String[] args) {
        printResult(args[0]);
    }

    private static boolean checkPassword(String password) {
        return password.equals(ORIGINAL_PASSWORD);
    }

    private static void printResult(String password) {
        System.out.println(checkPassword(password) ? MSG_CORRECT_PASSWORD : MSG_WRONG_PASSWORD);
    }
}
