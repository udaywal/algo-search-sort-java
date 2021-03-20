public class InsertionSort {

    public static void sort(int[] arr) {

        int temp = arr[0];
        for (int i=1; i<arr.length; i++) {
            for (int j=i; j>0; j--) {
                // System.out.println("i= "+i+" j= "+j);
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        print(arr);

    }

    static void print(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = {56,75,11,7,99,1,4,12};
        sort(arr);
    }
    
}
