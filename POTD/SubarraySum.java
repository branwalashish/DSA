import java.util.ArrayList;
import java.util.HashMap;

public class SubarraySum {
    
    // Simple sliding window approach
    public static ArrayList<Integer> findSubarraySimple(int[] arr, int target) {
        int start = 0; // Starting index of the window
        int currentSum = 0; // Current sum of the window

        // Iterate through the array
        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end]; // Add the current element to the window's sum

            // Shrink the window while the current sum is greater than the target
            while (currentSum > target && start <= end) {
                currentSum -= arr[start]; // Remove the first element of the window
                start++;
            }

            // Check if the current sum equals the target
            if (currentSum == target) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(start + 1); // Convert to 1-based index
                result.add(end + 1);   // Convert to 1-based index
                return result; // Return the result
            }
        }

        // If no subarray is found, return [-1]
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        return result;
    }

    // Optimized approach using HashMap
    public static ArrayList<Integer> findSubarrayOptimized(int[] arr, int target) {
        // Create a HashMap to store cumulative sums and their corresponding indices
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0; // Initialize the cumulative sum as 0

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i]; // Add the current element to the cumulative sum

            // Case 1: If the cumulative sum equals the target
            if (currentSum == target) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(1); // Subarray starts from index 1 (1-based index)
                result.add(i + 1); // Subarray ends at the current index (1-based index)
                return result; // Return the result
            }

            // Case 2: If (currentSum - target) exists in the map
            // It means there's a subarray with the sum equal to the target
            if (map.containsKey(currentSum - target)) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(map.get(currentSum - target) + 2); // Start index (convert to 1-based index)
                result.add(i + 1); // End index (convert to 1-based index)
                return result; // Return the result
            }

            // Store the current cumulative sum in the map with its index
            map.put(currentSum, i);
        }

        // Case 3: If no subarray with the target sum is found
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1); // Return -1 to indicate no subarray exists
        return result;
    }

    public static void main(String[] args) {
        // Test array and target
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        // First approach: Simple sliding window
        System.out.println("Using Simple Approach:");
        ArrayList<Integer> resultSimple = findSubarraySimple(arr, target);
        System.out.println(resultSimple.get(0) == -1 ? "No subarray found" : resultSimple.get(0) + " " + resultSimple.get(1));

        // Second approach: Optimized approach using HashMap
        System.out.println("\nUsing Optimized Approach:");
        ArrayList<Integer> resultOptimized = findSubarrayOptimized(arr, target);
        System.out.println(resultOptimized.get(0) == -1 ? "No subarray found" : resultOptimized.get(0) + " " + resultOptimized.get(1));
    }
}
