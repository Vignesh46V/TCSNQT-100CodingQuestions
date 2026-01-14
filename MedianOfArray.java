package NQTquestions;

import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        int[] arr = {7,3,1,8,4,5};
        System.out.println(findMedian(arr));
    }

    static double findMedian(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;

        if (n % 2 !=0 ){
            return arr[n/2];
        }
        else {
            return (arr[(n/2)-1] + arr[n/2]) /2.0;
        }
    }
}
