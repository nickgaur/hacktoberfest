package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepetion_Demo {
    public static void main(String[] args) {
        System.out.println("Program Started...");
        System.out.println("Establishing connection...");

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first Number:");
            int x = sc.nextInt();
            System.out.println("Enter the Second Number");
            int y = sc.nextInt();

            int add = x + y;
            System.out.println("Program Started..." + add);
            int sub = x - y;
            System.out.println("Program Started..." + sub);
            int div = x / y;
            System.out.println("Program Started..." + div);
            int mul = x * y;
            System.out.println("Program Started..." + mul);

            System.out.println("Rquesting data from server...");
            System.out.println("Sending data to server...");
        } catch (ArithmeticException e) {
            System.err.println("Cnnot divide by zero...");
        } catch (InputMismatchException e) {
            System.err.println("Invalid Input...");
        }

        sc.close();
    }
}
