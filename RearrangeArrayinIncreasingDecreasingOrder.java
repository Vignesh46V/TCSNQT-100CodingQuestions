package topHundredNQTquestions;

import java.util.Arrays;

public class RearrangeArrayinIncreasingDecreasingOrder {
    public static void main(String[] args) {
        int[]arr = {7,3,1,8,4,5};
        Arrays.sort(arr);
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Function to rearrange first half ascending and second half descending
    static void rearrange(int[] arr){
        int n = arr.length;

        //Reverse the SecondHalf.
        for (int mid= n/2, end = n-1; mid<end; mid++,end--){
            int temp = arr[mid];
            arr[mid] = arr[end];
            arr[end] = temp;
        }
    }

}
