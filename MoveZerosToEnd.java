package NQTquestions;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Give Array Size: ");
        // getting array size
        int n = input.nextInt();
        // fit
        int[] arr = new int[n];
        // adding elements in array...
        System.out.println("Add elements in array");
        for (int i = 0; i < n; i++){
            System.out.println(" enter "+i+"element ");
            arr[i] = input.nextInt();
        }


        Rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Rearrange(int []arr){

        int start = 0;
        int end = arr.length-1;

        while (start < end){
           if (arr[start] != 0){
               start++;
           } else if (arr[end] == 0) {
               end--;
           }else {
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;

               start++;
               end--;
           }
        }

    }
}
