import java.util.ArrayList;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};

        // Merge the two sorted arrays
        ArrayList<Integer> mergedList = mergeArrays(arr1, arr2);

        // Display the merged array
        System.out.println("Merged Array: " + mergedList);
    }

    // Function to merge two sorted arrays
    private static ArrayList<Integer> mergeArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        // Compare elements of both arrays and add the smaller one to the merged list
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedList.add(arr1[i]);
                i++;
            } else {
                mergedList.add(arr2[j]);
                j++;
            }
        }

        // Add the remaining elements of arr1 (if any)
        while (i < arr1.length) {
            mergedList.add(arr1[i]);
            i++;
        }

        // Add the remaining elements of arr2 (if any)
        while (j < arr2.length) {
            mergedList.add(arr2[j]);
            j++;
        }

        return mergedList;
    }
}
