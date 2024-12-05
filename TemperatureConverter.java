import java.util.Scanner;

public class TemperatureConverter {
    static Scanner scanner = new Scanner(System.in);
    static void celsiusToFahrenheit(double celsius) {
        if (celsius >= -273.15 && celsius <= 100) {
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%s°C is equivalent to %s°F", celsius, fahrenheit);
        }
        else {
            System.out.println("Invalid temperature");
        }
    }
    static void fahrenheitToCelsius(double fahrenheit) {
        if (fahrenheit >= -459.67 && fahrenheit <= 212) {
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("%s°F is equivalent to %s°C",fahrenheit,celsius);
        }
        else {
            System.out.println("Invalid temperature");
        }
    }
    public static void main(String[] args) {
        System.out.println("1. Convert Celsius to Fahrenheit.\n" + "2.Convert Fahrenheit to Celsius.");
        int decision = scanner.nextInt();

        if (decision == 1) {
            System.out.println("Please enter the temperature in Celsius: ");
            try{
                double temp = scanner.nextDouble();
                celsiusToFahrenheit(temp);
            }
            catch (Exception e) {
                System.out.println("Invalid Input");
            }


        }
        else if (decision == 2) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            try {
                double temp = scanner.nextDouble();
                fahrenheitToCelsius(temp);
            }
            catch (Exception e) {
                System.out.println("Invalid Input");
            }
        }
        else {
            System.out.println("Invalid input.");
        }
        scanner.close();
    }
}
