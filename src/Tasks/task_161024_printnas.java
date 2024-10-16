package Tasks;

import java.util.Scanner;

public class task_161024_printnas {
    public static void main(String[] args) {
        Scanner sa= new Scanner(System.in);
        System.out.println("Type Name");
        String a = sa.next();

        Scanner sb= new Scanner(System.in);
        System.out.println("Type Age");
        int b = sb.nextInt();

        Scanner sc= new Scanner(System.in);
        System.out.println("Type Salary");
         int c = sc.nextInt();

        System.out.println("\nUser Details as entered :");

        System.out.println("Name : "+a);
        System.out.println("Age : "+b);
        System.out.println("Salary: "+c);

    }
}
