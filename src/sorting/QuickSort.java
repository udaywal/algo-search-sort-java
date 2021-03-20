import java.util.Arrays;

public class QuickSort {

    private static int partition(int[] numbers, int start, int end) {

        int pivot = numbers[end];
        int partitionIndex = start;
        
        for (int i=start; i<end; i++) {
            if (numbers[i] < pivot) {
                int temp = numbers[partitionIndex];
                numbers[partitionIndex] = numbers[i];
                numbers[i] = temp;

                partitionIndex++;
            }
        }

        int temp = numbers[partitionIndex];
        numbers[partitionIndex] = pivot;
        numbers[end] = temp;

        return partitionIndex;
        
    }

    public static int[] sort(int[] numbers, int start, int end) {

        if (start < end) {
            int p = partition(numbers, start, end);
            sort(numbers, start, p);
            sort(numbers, p+1, end);
        }
        // After the recursion, each time pivot sorted in right position for same array.
        return numbers;

    }

    public static void main(String args[]) {
        int[] randomNumbers = {7,2,1,6,5,3,8,4};
        System.out.println(Arrays.toString(sort(randomNumbers, 0, randomNumbers.length-1)));
    }
    
}
