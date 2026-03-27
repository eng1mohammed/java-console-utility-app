import java.util.Scanner;

public class MultiplicationTable {

    public static void run(Scanner input) {
        int num = InputValidator.getInt(input, "Enter a number: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}