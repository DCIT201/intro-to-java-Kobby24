import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display options to user
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        int choice = 0;
        // Validate the choice input
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2) {
                    break; // valid input
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
            }
        }

        double temperature = 0;
        // Validate temperature input
        while (true) {
            try {
                System.out.print("Enter the temperature: ");
                temperature = Double.parseDouble(scanner.nextLine());
                break; // valid temperature input
            } catch (NumberFormatException e) {
                System.out.println("Invalid temperature input. Please enter a valid number for temperature.");
            }
        }

        // Perform the conversion based on user choice
        if (choice == 1) {
            // Celsius to Fahrenheit conversion
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", temperature, fahrenheit);
        } else if (choice == 2) {
            // Fahrenheit to Celsius conversion
            double celsius = (temperature - 32) * 5/9;
            System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", temperature, celsius);
        }

        scanner.close(); // Close scanner after use
    }
}
