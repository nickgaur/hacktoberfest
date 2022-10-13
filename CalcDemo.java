package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcDemo {
    Scanner sc = new Scanner(System.in);
    int f;
    int s;
    int result;

    void takeFirstNumber() {
        try {
            System.out.println("Enter the first Number:");
            f = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input...");
            sc.nextLine();
            takeFirstNumber();
        }
    }

    void takeSecondNumber() {
        try {
            System.out.println("Enter the second Number");
            s = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input...");
            sc.nextLine();
            takeSecondNumber();
        }
    }

    void addition() {
        try {
            result = s + f;
        } catch (ArithmeticException e) {
            System.out.println("Error doing addition");
            addition();
        }
    }

    void subtraction() {
        try {
            result = f - s;
        } catch (ArithmeticException e) {
            System.out.println("Error Doing Subtraction");
            subtraction();
        }

    }

    void division() {
        try {
            result = f / s;
        } catch (ArithmeticException e) {
            System.out.println("Error doing division");
            System.out.println("Cannot divide by Zero");
            takeSecondNumber();
            division();
        }
    }

    void multiplication() {
        try {
            result = f * s;
        } catch (ArithmeticException e) {
            System.out.println("Error while multiplying..");
            multiplication();
        }
    }

    void print() {
        System.out.println("Result is:-" + result);
    }

    void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {
        CalcDemo obj = new CalcDemo();
        obj.takeFirstNumber();
        obj.takeSecondNumber();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
        obj.print();
        obj.closeScanner();
    }
}
