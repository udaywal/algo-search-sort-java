/* Time & space complexity = O((n-m)m) & O(1) */

public class NumberOfSubArrays {

    public static int numberOfSubarrays(int[] arr, int n, int d, int m){

        int subArrays = 0;
        int sum = 0;
        for (int i=0; i<=n-m; i++) {
            for (int j=0; j<m; j++) {
                sum = sum + arr[i+j];
            }
            if (sum == d) {
                subArrays++;
            }
            sum = 0;
        }
        return subArrays;
    
    }

    public static void main(String[] args) {
        int[] numbers = {1,4,3,5,6,4};
        int dayOfBirth = 18;
        int monthOfBirth = 4;
        System.out.println(numberOfSubarrays(numbers, numbers.length, dayOfBirth, monthOfBirth));
    }
    
}

/* To decrease the time complexity, we can write it like this. */
// public static int numberOfSubarrays(int[] arr, int n, int d, int m){

//     int subArrays = 0;
//     int sum = 0;

//     for (int j=0; j<m; j++) {
//         sum = sum + arr[j];
//     }
//     for (int i=0; i<n-m; i++) {
//         sum = sum - arr[i] + arr[i+m];
//         if (sum == d) {
//             subArrays++;
//         }
//     }
//     return subArrays;

// }