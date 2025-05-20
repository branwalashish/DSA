/* https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
*
*/
import java.util.Arrays;
public class RemoveDuplicate_80{
    public static int removeDuplicates(int[] nums) {
    //    1st way to solve this 
        int slow = 2;
        int fast = 2;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
   // 2nd way to solve this problem
        /*
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n != nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
        */
    }

  public static void main(String [] args){
  int arr[] = {0,0,0,1,1,1,1,2,2,2,3,4,4};
   System.out.println("Original array: " + Arrays.toString(arr));
        int len = removeDuplicates(arr);
        System.out.println("New length: " + len);
    System.out.println("After changes new array: \n"+Arrays.toString(arr));
  }
}
