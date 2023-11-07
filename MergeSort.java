import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        // arr = sort(arr);
        sortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;

            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {

            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {

            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }

    public static void sortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int m = (s + e) / 2;
        sortInPlace(arr, s, m);
        sortInPlace(arr, m, e);

        mergeInPalce(arr, s, m, e);

    }

    private static void mergeInPalce(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int k2 = 0; k2 < mix.length; k2++) {
            arr[s + k2] = mix[k2];
        }
        System.out.println(Arrays.toString(arr));
    }
}
