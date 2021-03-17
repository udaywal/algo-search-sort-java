/**** LINEAR SEARCH ALGORITHM ****/
// Time complexity = O(n)

import java.util.Scanner;

public class LinearSearch {

    public static int search(int[] arr, int key) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        // int[] arr1 = {23, 45, 21, 55, 234, 1, 34, 90};
        // int searchKey = 34;
        // System.out.println("Key " + searchKey + " found at index: " + linearSearch(arr1, searchKey));
        // int[] arr2 = {123, 445, 421, 595, 2134, 41, 304, 190};
        // searchKey = 421;
        // System.out.println("Key " + searchKey + " found at index: " + linearSearch(arr2, searchKey));
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] array = new int[count];
        for (int i=0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int searchKey = input.nextInt();
        input.close();

        System.out.println("Key " + searchKey + " found at index: " + search(array, searchKey));
    }

}
