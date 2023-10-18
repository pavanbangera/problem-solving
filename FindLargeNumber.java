import java.util.Scanner;

public class FindLargeNumber {
    public static void main(String[] args) {
        System.out.print("Enter the Length of array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println();
        System.out.print("Enter the number: ");
        int arr[] = new int[n];
        int i = 0;
        while (i < n) {
            arr[i] = in.nextInt();
            i++;
        }
        int max = Integer.MIN_VALUE;
        i = 0;
        while (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];

            }
            i++;
        }
        System.out.println("Largest number is: " + max);
    }

}