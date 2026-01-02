package topHundredNQTquestions;

public class SumOfTheElementsOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));
    }

    static int sum(int[]arr){
        //initializing first value as total
        int sum = arr[0];
// adding the sum using loop//
        for (int i=1; i< arr.length; i++){
            sum =  sum + arr[i];
        }
        return sum;
    }
}
