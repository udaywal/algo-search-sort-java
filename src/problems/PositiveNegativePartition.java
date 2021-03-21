import java.util.ArrayList;
import java.util.Collections;

public class PositiveNegativePartition {

    public static void partitionArray( int n, int[] arr){

        ArrayList<Integer> positiveList = new ArrayList<>();
        ArrayList<Integer> negativeList = new ArrayList<>();

        for (int i=0; i<n; i++) {
            if (arr[i] >= 0) {
                positiveList.add(arr[i]);
            } else {
                negativeList.add(arr[i]);
            }
        }

        if (arr[0] >= 0) {
            printList(positiveList, positiveList.size());
            if (negativeList.size() > 0) {
                System.out.println();
                printList(negativeList, negativeList.size());
            } else {
                System.out.println("No negative numbers present.");
            }
        } else {
            printList(negativeList, negativeList.size());
            if (positiveList.size() > 0) {
                System.out.println();
                printList(positiveList, positiveList.size());
            } else {
                System.out.println("No positive numbers present.");
            }
        }
    
    }

    public static void printList (ArrayList<Integer> list, int length) {
        Collections.sort(list);
        for(int i=0; i < length; i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int[] randomNumbers = {};
        partitionArray(randomNumbers.length, randomNumbers);
    }
    
}
