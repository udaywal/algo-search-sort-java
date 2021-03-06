/*** BINARY SEARCH ALGORITHM ***/
// Time complexity = O(logn)
// Space complexity = O(1) - if we have an sorted array.

public class BinarySearch {

    /**
     * Expectation : Array should be sorted
     *
     * if the num is found then print the index
     *
     * else print that the number is not found
     * @param arr
     * @param left
     * @param right
     * @param num
     *
     * TC : O(logn)
     *
     */
    public static void search(int[] arr, int left, int right, int num){
   
      //Base condition
      if(left > right){
        System.out.println("Number : "+ num +" can't be found in the array");
        return ;
      }
   
      int mid = left + (right - left)/2 ; // (left+right)/2 // we does it for big numbers (https://ai.googleblog.com/2006/06/extra-extra-read-all-about-it-nearly.html)
   
      if (arr[mid] == num) {
        System.out.println(num + " is found at the index "+ mid);
      } else if ( arr[mid] > num){
        search(arr, left, mid-1, num);
      } else {
        search(arr, mid+1, right, num);
      }

    }
   
   
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6,7,8};
      search(arr, 0, arr.length-1 , 7);
    }

   }
   