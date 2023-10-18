import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth number: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= n; i++) {
            System.out.print(a + b + " ");
            int temp = b;
            b += a;
            a = temp;
        }
        System.out.println("Fibbo of " + n + " is: " + b);
    }
}
