import java.util.Arrays;

/* 
Maximum Product Quadruple in an Array
You are given an array and are asked to find the maximum product quadruple in it, i.e., 
the largest product that can be obtained by multiplying four numbers in the array.

> One of the approach is to loop and traverse to all the possible cases of max quadriple
> Which has the efficieny of O(n^6)

> But here is the solution to achieve the efficieny of O(n)
    x = firstMax * secondMax * thirdMax * fourthMax
    y = firstMin * secondMin * thirdMin * fourthMin
    z = firstMin * secondMin * firstMax * secondMax 
*/

public class MaxProdQuad {

    public static int maxQuadProd(int[] arr, int n){
        Arrays.sort(arr);
        int[] newArr = new int[3];
        newArr[0] = arr[n] * arr[n-1] * arr[n-2] * arr[n-3];
        newArr[1] = arr[0] * arr[1] * arr[2] * arr[3];
        newArr[2] = arr[0] * arr[1] * arr[n] * arr[n-1];
        Arrays.sort(newArr);
        return newArr[2];
    }

    public static void main(String[] args) {
        int[] numbers = {1,4,3,5,6,4};
        int max =  maxQuadProd(numbers, numbers.length -1);
        if(max == -1) {
            System.out.println("No Maximum Product Quadruple");
        } else {
            System.out.println(max);
        }
    }
    
}
