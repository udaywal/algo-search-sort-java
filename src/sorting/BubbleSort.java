import java.util.Arrays;

public class BubbleSort {

    public static int[] sort (int[] array) {
        int n = array.length;
        int temp;
        int numberOfSwaps = 0;
        for (int i=0; i<n; i++) {
            for (int j=1; j<n-i; j++) {
                if (array[j-1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    numberOfSwaps++;
                }
            }
        }
        System.out.println(numberOfSwaps);
        return array;
    }

    public static void main(String[] args) {
        int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers); // bubble sort
        // print out the sorted numbers
        System.out.println(Arrays.toString(sortedNumbers));
    }
    
}
