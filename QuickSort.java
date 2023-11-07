import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 0, 1, 6, 3, 4, 9 };
        // sort(arr, 0, arr.length - 1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int m = (s + e) / 2;
        m = arr[m];
        int i = s;
        int j = e;

        while (i <= j) {
            while (arr[i] < m) {
                i++;
            }
            while (arr[j] > m) {
                j--;

            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        sort(arr, s, j);
        sort(arr, i, e);
    }
}
