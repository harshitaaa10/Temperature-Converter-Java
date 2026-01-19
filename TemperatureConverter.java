import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("===== Temperature Converter =====");

        do {
            System.out.println("\n1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = sc.nextDouble();
                    System.out.println("Temperature in Fahrenheit: " 
                            + celsiusToFahrenheit(celsius));
                    break;

                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = sc.nextDouble();
                    System.out.println("Temperature in Celsius: " 
                            + fahrenheitToCelsius(fahrenheit));
                    break;

                case 3:
                    System.out.println("Thank you for using the converter!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        sc.close();
    }
}
