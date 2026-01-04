package topHundredNQTquestions;

public class Palindrome {
    public static void main(String[] args) {
        int num = 123;
        int original = num;
        int reversed = 0;

        while(num >0){
            int digit = num % 10;// get last digit
            reversed = reversed * 10 + digit;
            num = num /10;

        }

        if (original == reversed){
            System.out.println(original + " is a Palindrome");
        }
        else {
            System.out.println(original + " is not a Palindrome");
        }
    }
}
