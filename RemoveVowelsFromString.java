package NQTquestions;

public class RemoveVowelsFromString {

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(removeVowels(s));
    }

    static String removeVowels(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            char lower = Character.toLowerCase(ch);

            if (lower == 'a' || lower == 'e' || lower == 'i'
                    || lower == 'o' || lower == 'u') {
                continue; // skip vowels
            }

            result.append(ch);
        }
        return result.toString();
    }
}