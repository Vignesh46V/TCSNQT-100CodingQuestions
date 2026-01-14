package NQTquestions;

import java.util.Scanner;

public class HowmanySundays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String day = input.next();   // mon, tue, wed...
        int n = input.nextInt();     // number of days

        String[] arr = {"mon","tue","wed","thu","fri","sat","sun"};

        int startIndex = 0;

        // find index of starting day
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(day)) {
                startIndex = i;
                break;
            }
        }

        // day number on which first Sunday occurs
        int firstSundayDay = 6 - startIndex + 1;

        int totalSundays = 0;

        // check if at least one Sunday exists
        if (firstSundayDay <= n) {
            totalSundays = 1 + (n - firstSundayDay) / 7;
        }

        System.out.println(totalSundays);
    }
}
