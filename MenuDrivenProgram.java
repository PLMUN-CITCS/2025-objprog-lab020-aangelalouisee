import java.util.Scanner;
public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // loop to keep showing the menu until the user chooses to exit
        do {
            displayMenu(); // show the menu
            System.out.print("Enter your choice (1-3): "); // ask the user to input their choice
            choice = scanner.nextInt(); // read user’s choice
            handleMenuChoice(choice); // process the user’s choice
        } while (choice != 3); // exit when the user chooses option 3
    }

    // method to display the menu options
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    // method to handle the user's menu choice
    public static void handleMenuChoice(int choice) {
        if (choice == 1) {
            greetUser();
        } else if (choice == 2) {
            checkEvenOrOdd();
        } else if (choice == 3) {
            System.out.println("Exiting program. Goodbye!");
        } else {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }
    }

    // method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // method to get an integer from the user and check if it's even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in); // create a new scanner
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // read the integer

        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
