import java.util.Scanner;

public class salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input basic salary, allowances, and deductions
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter the total allowances: ");
        double allowances = scanner.nextDouble();

        System.out.print("Enter the total deductions: ");
        double deductions = scanner.nextDouble();

        // Calculate net salary
        double netSalary = calculateSalary(basicSalary, allowances, deductions);

        // Display net salary
        System.out.printf("The net salary is: ₹%.2f\n", netSalary);

        scanner.close();
    }

    // Function to calculate net salary
    public static double calculateSalary(double basic, double allowances, double deductions) {
        return basic + allowances - deductions;
    }
}