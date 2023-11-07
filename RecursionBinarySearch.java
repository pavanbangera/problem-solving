import java.util.Arrays;

public class RecursionBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(print(arr, 7, 0, arr.length - 1));
    }

    static public int print(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = (s + e) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return print(arr, target, s, mid - 1);
        } else {
            return print(arr, target, mid + 1, e);
        }

    }

}
