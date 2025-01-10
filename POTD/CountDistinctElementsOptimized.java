import java.util.*; 

public class CountDistinctElementsOptimized {

    public static List<Integer> countDistinctElements(int[] arr, int k) {
        List<Integer> result = new ArrayList<>(); // Result list jisme har window ka distinct count store hoga
        Map<Integer, Integer> freqMap = new HashMap<>(); // HashMap banaya frequency track karne ke liye
        
        // Pehla window ka frequency map banao
        for (int i = 0; i < k; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        result.add(freqMap.size()); // Pehla window ka distinct count result mein add kiya
        
        // Ab baki windows process karte hain
        for (int i = k; i < arr.length; i++) {
            // Purane element ko remove karo (left side ka element)
            int leftElem = arr[i - k];
            if (freqMap.get(leftElem) == 1) {
                freqMap.remove(leftElem); // Agar element ki frequency 1 hai to remove kar do
            } else {
                freqMap.put(leftElem, freqMap.get(leftElem) - 1); // Frequency 1 se kam kar do
            }
            
            // Naye element ko add karo (right side ka element)
            int rightElem = arr[i];
            freqMap.put(rightElem, freqMap.getOrDefault(rightElem, 0) + 1);
            
            // Current window ka distinct count result mein add karo
            result.add(freqMap.size());
        }
        
        return result; // Har window ka distinct count return karte hain
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 3, 4, 2, 3};
        int k1 = 4;
        System.out.println(countDistinctElements(arr1, k1));  // Output: [3, 4, 4, 3]

        int[] arr2 = {4, 1, 1};
        int k2 = 2;
        System.out.println(countDistinctElements(arr2, k2));  // Output: [2, 1]

        int[] arr3 = {1, 1, 1, 1, 1};
        int k3 = 3;
        System.out.println(countDistinctElements(arr3, k3));  // Output: [1, 1, 1]
    }
}
