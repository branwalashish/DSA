package timeComplexity;

/**
 * This class demonstrates various algorithms with different time complexities.
 * 
 * Time Complexities where i covered:
 *
 * - O(1): Constant time
 *
 * - O(n): Linear time
 *
 *- O(n^2): Quadratic time
 *
 * - O(log n): Logarithmic time
 *
 * - O(n log n): Merge sort
 *
 * - O(2^n): Exponential time
 * 
 *  📌 Learn more about Time Complexity:
 * I’ve shared a beginner-friendly explanation with real-life examples in this LinkedIn post:
 * https://www.linkedin.com/posts/branwalashish_dsa-software-engineer-activity-7224964662553985025-5wbg?utm_source=share&utm_medium=member_desktop&rcm=ACoAACpon0UBdBftqUZAEZz9Qk-VTsVQ6J-Y4hc
 */
public class Demo {

    // O(1) - Constant time: Checks if a year is a leap year
    public static boolean leapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    // O(1) - Constant time: Returns first element of array
    public static int getFirstElement(int[] arr) {
        return arr[0];
    }

    // O(n) - Linear time: Finds the maximum element in the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // O(n^2) - Quadratic time: Prints all pairs in the array
    public static void printAllPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }

    // O(log n) - Logarithmic time: Binary Search
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // O(n log n) - Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        for (i = left, k = 0; i <= right; i++, k++) arr[i] = temp[k];
    }

    // O(2^n) - Exponential time: Fibonacci using recursion
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int[] years = {1900, 2000, 2004, 2023, 2024};
        for (int year : years) {
            System.out.println("Year " + year + " is leap year? " + leapYear(year));
        }

        int[] arr = {5, 3, 8, 6, 2};
        System.out.println("First element: " + getFirstElement(arr));
        System.out.println("Max element: " + findMax(arr));
        System.out.println("All pairs:");
        printAllPairs(arr);

        int[] sortedArr = {1, 2, 3, 4, 5, 6};
        int index = binarySearch(sortedArr, 4);
        System.out.println("Index of 4 in sorted array: " + index);

        int[] mergeArr = {9, 3, 7, 1, 6};
        mergeSort(mergeArr, 0, mergeArr.length - 1);
        System.out.print("Sorted using merge sort: ");
        for (int num : mergeArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Fibonacci(5): " + fibonacci(5));
    }
}
