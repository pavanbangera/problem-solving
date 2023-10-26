import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };

        // selectionSort(arr);
        bubblesSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static public void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            swap(arr, max, arr.length - i - 1);
        }
    }

    static public void bubblesSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swapped = true;
                    swap(arr, j, j - 1);
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
