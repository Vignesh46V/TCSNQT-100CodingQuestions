package topHundredNQTquestions;

public class SecondSmallAndSecondLargestInAnArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,0};
        System.out.println(secondSmallest(arr));
    }

    static int  secondSmallest(int[] arr){
        if (arr.length < 2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        int large = Integer.MIN_VALUE;
        int SecondLarge = Integer.MIN_VALUE;

        for(int num: arr){

            if (num < small){
                secondSmall = small;
                small = num;
            } else if (num > small && num < secondSmall) {
                secondSmall = num;
            }

            if(num > large){
                SecondLarge = large;
                large = num;
            } else if (num < large && num > SecondLarge) {
                SecondLarge = num;
            }
        }

        return SecondLarge;
    }
}
