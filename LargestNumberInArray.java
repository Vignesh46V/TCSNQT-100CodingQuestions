package topHundredNQTquestions;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,9};
        System.out.println("The largest element in array is "+FindMax(arr));
    }

    static int FindMax(int[] arr){
        // Assuming the first element as largest number
        int max = arr[0];

        // compare the arr[i] with max , if arr[i] big then replace that num as max.
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
