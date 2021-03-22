public class CommonArrayProblems {

    /*** duplicateNumbersInArray ***/
    // Approach 1: You can use two nested loops to find the duplicate numbers, but time complexity would be O(n^2).
    // Approach 2: You can use HashSet to store all the elements of the array. 
    //             But it will not allow duplicates and so, when the same number is sent for storage in HashSet, 
    //             it will return ‘false’ as it is already present in HashSet. And time complexity would be O(n).
    public static void duplicateNumbersInArray(int[] arr, int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) 
                    System.out.print(arr[i] + " ");
            }
        }
    }

    /*** getMissingNumber ***/
    // 1. If only one number is missing, then find the sum of all the numbers in the array and subtract it from n(n+1)/2.
    // 2. If multiple numbers are missing, then use the BitSet class. The BitSet class is a special type of array that 
    //      holds bit values. When you initialise this class, its default value will become 0. 
    //      So, initialise a bitset of size n, traverse the array and for each element set, change the bit at the index 
    //      of that number to 1. Finally, return the indices for which the particular bits are not set to 1.
    public static void getMissingNumber(int arr[], int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= arr[i];
        System.out.print(total);
    }

    /*** findSingle ***/
    // Find the element that appears once in an array where every other element appears twice
    public static int findSingle(int arr[], int n) {
        int num = arr[0];
        for (int i = 1; i < n; i++)
            num = num ^ arr[i];
        return num;
    }

    /*** powerFunction ***/
    // Can you think of an efficient approach to calculate x raised to the nth power?
    public static int powerFunction(int x, int y) {
        int temp;
        if( y == 0)
            return 1;
        temp = powerFunction(x, y/2);
        if (y%2 == 0)
            return temp*temp;
        else
            return x*temp*temp;
    }
    
    /*** Moore's Voting Algorithm ***/// 
    // An element in an array is called a ‘majority element’ if it occurs more than n/2 times, 
    // where n is the size of the array. Now, write the pseudocode for the Boyer–Moore majority vote algorithm 
    // to find the majority element.
    public static int findMajority(int arr[], int n) { 
        int maj_index = 0, count = 1;
        for(int i=1;i<arr.length;i++){
            if (arr[maj_index] == arr[i])
                count++;
            else
                count--;
            if (count == 0){
                maj_index = i;
                count = 1;
            }
        }
        return arr[maj_index];
    }

}
