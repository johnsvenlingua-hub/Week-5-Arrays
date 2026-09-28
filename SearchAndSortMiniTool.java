import java.util.Arrays;

public class SearchAndSortMiniTool {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 64, 95, 88, 72, 90};
        int target = 95;

        System.out.println("=== SEARCH & SORT MINI-TOOL ===");

        //Linear Search
        int foundIndex = -1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Linear Search: Target " + target + " found at index " + foundIndex + ".");
        } else {
            System.out.println("Linear Search: Target " + target + " was not found in the array.");
        }

        //Sorting a copy of the array
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        //Print original and sorted versions
        System.out.println("\nOriginal Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array:   " + Arrays.toString(sortedScores));

        //Note on why sorting a copy matters:
        //Sorting mutates the array in place. If we sorted the original array before searching,positional metadata (such as original student seat numbers or chronological entry indices)would be permanently lost. Sorting a duplicate preserves the original index-to-data integrity. */
    }
}
