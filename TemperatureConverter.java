import java.util.Scanner;



public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display options
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        // Validate user choice
        int choice = 0;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2) {
                    break; // valid choice
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
            }
        }

        // Get temperature input and validate
        double temperature = 0;
        while (true) {
            try {
                System.out.print("Enter the temperature: ");
                temperature = Double.parseDouble(scanner.nextLine());
                break; // valid temperature
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for the temperature.");
            }
        }

        // Perform conversion
        if (choice == 1) {
            // Celsius to Fahrenheit
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", temperature, fahrenheit);
        } else if (choice == 2) {
            // Fahrenheit to Celsius
            double celsius = (temperature - 32) * 5/9;
            System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", temperature, celsius);
        }

        scanner.close();
    }
}
