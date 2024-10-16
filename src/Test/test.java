package Test;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        System.out.println("Enter second num");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int maxVal = (a>b ? a:b);
        System.out.println("The maximum value is: " + maxVal);
        sc.close();

    }
}