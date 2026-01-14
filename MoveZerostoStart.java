package NQTquestions;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerostoStart {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        arrange(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void arrange(int[] arr){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int j : arr) {
            if (j == 0) {
                count0++;
            } else if (j == 1) {
                count1++;
            }
            else if (j == 2){
                  count2++;
                }
             else {
                System.out.println("invalid number");;
            }
        }

        int index = 0;

        for (int i  = 0; i < count0; i++) {
            arr[index] = 0;
            index++;
        }

        for (int i  = 0; i < count1; i++) {
            arr[index] = 1;
            index++;
        }

        for (int i  = 0; i < count2; i++) {
            arr[index] = 2;
            index++;
        }

    }
}
