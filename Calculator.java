import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int total = 0;
            System.out.print("Enter the operator ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("Enter the numbers");

                int a = in.nextInt();
                int b = in.nextInt();
                if (op == '+') {
                    total = a + b;
                }
                if (op == '-') {
                    total = a - b;
                }
                if (op == '*') {
                    total = a * b;
                }
                if (op == '/') {
                    total = a / b;
                }
                if (op == '%') {
                    total = a % b;
                }

                System.out.println("Total: " + total);

            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("invalid key");
            }
            System.out.println("enter x for exit");

        }
    }
}
