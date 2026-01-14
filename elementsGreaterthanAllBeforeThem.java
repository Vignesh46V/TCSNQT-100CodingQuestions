package NQTquestions;

import java.util.Scanner;

public class elementsGreaterthanAllBeforeThem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        //Assuming the Default Values...
        int max = arr[0];
        int count = 1;

        // comparing the elements
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
                count++;
            }
        }

        System.out.println(count);

    }
}
