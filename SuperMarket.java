package NQTquestions;

import java.util.Scanner;

public class SuperMarket {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();// 5244;

        int product = 1;

        while ( n > 0){
            int digit = n  % 10;
            product = product * digit;
            n =  n / 10;
        }

        System.out.println(product);
    }
}
