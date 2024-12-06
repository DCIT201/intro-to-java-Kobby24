import java.util.Scanner;

public class TemperatureConverter {
    static Scanner scanner = new Scanner(System.in);
    static boolean celsiusToFahrenheit(double celsius) {
        if (celsius >= -273.15 && celsius <= 100) {
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%s°C is equivalent to %s°F", celsius, fahrenheit);
            return true;
        }
        else {
            System.out.println("Invalid temperature");
            
            return false;
        }

    }
    static boolean fahrenheitToCelsius(double fahrenheit) {
        if (fahrenheit >= -459.67 && fahrenheit <= 212) {
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("%s°F is equivalent to %s°C",fahrenheit,celsius);
            return true;
        }
        else {
            System.out.println("Invalid temperature");
            return false;
        }
    }
    static void error(){
        System.out.println("Invalid Input! Please try again");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Convert Celsius to Fahrenheit.\n" + "2.Convert Fahrenheit to Celsius.");
            try {
                int decision = Integer.parseInt(scanner.nextLine());
                if (decision == 1 || decision == 2) {
                    if (decision == 1) {
            System.out.println("Please enter the temperature in Celsius: ");
            try{
                double temp = Double.parseDouble(scanner.nextLine());
                if (celsiusToFahrenheit(temp)){
                    break;
                };

            }
            catch (Exception e) {
                error();
            }
        }
                    else if (decision == 2) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            try {
                double temp = Double.parseDouble(scanner.nextLine());
                if (fahrenheitToCelsius(temp)){
                break;
            }
            }
            catch (Exception e) {
                error();
            }
        }
    }
                else {
                    error();
                }
            }
            catch (Exception e) {
                error();
            }
        }
    }
}
