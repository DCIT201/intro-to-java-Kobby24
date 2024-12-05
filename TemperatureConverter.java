import java.util.Scanner;

public class TemperatureConverter {
    static Scanner scanner = new Scanner(System.in);

    // Method to convert Celsius to Fahrenheit
    static void celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.2f°C is equivalent to %.2f°F.%n", celsius, fahrenheit);
    }

    // Method to convert Fahrenheit to Celsius
    static void fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.2f°F is equivalent to %.2f°C.%n", fahrenheit, celsius);
    }

    // Method to handle user input
    static double getTemperatureInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid numeric temperature.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("1. Convert Celsius to Fahrenheit.");
        System.out.println("2. Convert Fahrenheit to Celsius.");

        // Get user decision
        int decision = 0;
        while (true) {
            System.out.print("Enter your choice (1 or 2): ");
            try {
                decision = scanner.nextInt();
                if (decision == 1 || decision == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numeric choice (1 or 2).");
                scanner.next(); // Clear invalid input
            }
        }

        // Perform conversion based on user's choice
        if (decision == 1) {
            double celsius = getTemperatureInput("Enter the temperature in Celsius: ");
            celsiusToFahrenheit(celsius);
        }
        else if (decision == 2) {
            double fahrenheit = getTemperatureInput("Enter the temperature in Fahrenheit: ");
            fahrenheitToCelsius(fahrenheit);
        }

        System.out.println("Thank you for using the Temperature Converter!");
    }
}
