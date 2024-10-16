package labexs;

import java.util.Scanner;

public class task_1610 {
    public static void main(String[] args) {
        Scanner sa= new Scanner(System.in);
        System.out.println("enter 1st num number ");
        int a = sa.nextInt();

        Scanner sb= new Scanner(System.in);
        System.out.println("enter 2nd number");
        int b = sb.nextInt();

        Scanner sc= new Scanner(System.in);
        System.out.println("enter 3rd number");
        int c = sc.nextInt();

        int result=(a>b&&a>c)?a:(b>=c)?b:c;
        System.out.println("The max number is -> "+result);
    }
}
