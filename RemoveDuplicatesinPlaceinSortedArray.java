package NQTquestions;

public class RemoveDuplicatesinPlaceinSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};

        int k = removeDuplicates(arr); // get count

        // print only unique elements
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // number of unique elements
    }
}
