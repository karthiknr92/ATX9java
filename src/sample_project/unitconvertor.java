import java.util.Scanner;

public class unitconvertor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the conversion choices
        System.out.println("Choose a conversion option:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Convert Kilometers to Miles
                System.out.print("Enter the distance in kilometers: ");
                double kilometers = scanner.nextDouble();
                double miles = kilometers * 0.621371;
                System.out.printf("%.2f kilometers is equal to %.2f miles.\n", kilometers, miles);
                break;

            case 2:
                // Convert Celsius to Fahrenheit
                System.out.print("Enter the temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.\n", celsius, fahrenheit);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;
        }

        scanner.close();
    }
}
