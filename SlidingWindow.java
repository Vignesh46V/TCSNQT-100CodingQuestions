package NQTquestions;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        int k = 33;

        int sum =0 , start = 0;

        for (int end = 0; end <arr.length; end++){
            sum  = sum + arr[end];

            while (sum > k){
             sum -= arr[start++];
            }

            if (sum == k){
                System.out.println("Match Found");
            }
        }
    }
}
