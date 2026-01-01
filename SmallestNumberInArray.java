package topHundredNQTquestions;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        System.out.println(FindMin(arr));
    }

    static int FindMin(int[] arr){
        int min = arr[0];

        for (int i=1; i< arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
}
