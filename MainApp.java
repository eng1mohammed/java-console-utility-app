import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            Menu.showMenu();
            choice = InputValidator.getInt(input, "Choose an option: ");
            switch (choice) {
                case 1:
                    Calculator.run(input);
                    break;
                case 2:
                    GradeEvaluator.run(input);
                    break;
                case 3:
                    MultiplicationTable.run(input);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice >= 4);

        input.close();
    }
}
