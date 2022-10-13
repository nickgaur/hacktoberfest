package exception_handling;

import java.util.Scanner;

class CheckException extends Exception {

}

class CheckBalanceException extends RuntimeException {
    String message;

    public CheckBalanceException() {
        this.message = "";
    }

    public CheckBalanceException(String msg) {
        this.message = msg;
    }

    @Override
    public String toString() {
        return "CheckBalanceException[message=" + message + "]";
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        int n;
        double value = 5000.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements you want to store:");
        n = sc.nextInt();
        double[] Balance = new double[100];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Balance amount");
            Balance[i] = sc.nextDouble();

            try {
                if (Balance[i] < value) {
                    System.out.println("Balance should be greater than 5000...");
                } else {
                    throw new CheckBalanceException("The entered amount is..." + Balance[i]);
                }
            } catch (CheckBalanceException e) {
                System.out.println(e);
            }
        }
        sc.close();
    }
}
