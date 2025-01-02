package leetcode;
// https://leetcode.com/problems/reverse-integer/description/ //problem's link

public class ReverseInteger {
    public int reverse(int x) {
        int res = 0; // Result variable
        boolean isNegative = x < 0; // Check if x is negative
        x = Math.abs(x); // Work with absolute value
        
        while (x != 0) {
            int rem = x % 10; // Extract the last digit
            x /= 10; // Remove the last digit
            
            // Check for overflow
            if (res > Integer.MAX_VALUE / 10 || 
                (res == Integer.MAX_VALUE / 10 && rem > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            
            res = res * 10 + rem; // Append the digit to the result
        }
        
        return isNegative ? -res : res; // Reapply the sign
    }
}
