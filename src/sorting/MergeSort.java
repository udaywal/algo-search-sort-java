import java.util.Arrays;

public class MergeSort {

    private static void merge(int[] numbers, int start, int mid, int end) {

        /* Dividing the array */
        int leftLength = mid - start + 1;
        int rightLength = end - mid;
        
        int[] L = new int[leftLength];
        int[] R = new int[rightLength];

        for (int i=0; i<leftLength; i++) {
            L[i] = numbers[start + i];
        }
        for (int j=0; j<rightLength; j++) {
            R[j] = numbers[mid+1 + j];
        }

        /* Sorting of divided array in decending order */
        // creating pointers
        int l=0; 
        int r=0;
        int k=start; 

        while (l<leftLength && r<rightLength) {
            if (L[l] <= R[r]) {
                numbers[k] = L[l];
                l++;
            } else {
                numbers[k] = R[r];
                r++;
            }
            k++;
        }

        while (l<leftLength) {
            numbers[k] = L[l];
            l++;
            k++;
        }
        while (r<rightLength) {
            numbers[k] = R[r];
            r++;
            k++;
        }
        
    }

    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String args[]) {
        int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 67, 5};
        sort(randomNumbers, 0, randomNumbers.length-1);
        System.out.println(Arrays.toString(randomNumbers));
    }
}