package NQTquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicatesFromUnsortedArray {

    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 2, 1, 7, 4};

        List<Integer> result = removeDuplicates(arr);
        System.out.println(result);
    }

    // function to remove duplicates using HashMap
    static List<Integer> removeDuplicates(int[] arr) {

        HashMap<Integer, Boolean> seen = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int val : arr) {
            if (!seen.containsKey(val)) {   // ✅ correct condition
                result.add(val);
                seen.put(val, true);
            }
        }
        return result;
    }
}
