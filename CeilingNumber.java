import java.util.Arrays;

public class CeilingNumber {
    public static void main(String[] args) {

        // int[] arr = { 0, 5, 8, 10, 45, 67, 87 };
        // System.out.println(binarySearch(arr, 88));
        char[] arr = { 'a', 'b', 'c' };
        System.out.println(Arrays.toString(arr));
        System.out.println(binaryChar(arr, 'b'));

    }

    static int binarySearch(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return 1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                return arr[mid];
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return arr[start];

    }

    static char binaryChar(char[] arr, char target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];

    }

}
