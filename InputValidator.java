import java.util.Scanner;

public class InputValidator {

    public static int getInt(Scanner input, String message) {
        int value;
        while (true) {
            try {
                System.out.print(message);
            value = input.nextInt();
input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input!");
                input.next();
            }
        }
        return value;
    }

    public static double getDouble(Scanner input, String message) {
        double value;
        while (true) {
            try {
                System.out.print(message);
            value = Double.parseDouble(
    input.next()
    .replace(",", ".")
    .replace("٫", ".")
);
input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input!");
                input.next();
            }
        }
        return value;
    }
}