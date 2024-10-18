import java.util.Scanner;

public class triclassfr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the side lengths
        System.out.print("Enter the length of the first side: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of the second side: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of the third side: ");
        double side3 = scanner.nextDouble();

        // Check if the side lengths form a valid triangle
        if (isValidTriangle(side1, side2, side3)) {
            // Classify the triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is scalene.");
            }
        } else {
            System.out.println("The side lengths do not form a valid triangle.");
        }

        scanner.close();
    }

    // Function to check if the side lengths form a valid triangle
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}
