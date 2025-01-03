package leetcode;
//
class ZigZagConversion {

    /**
     * Basic approach for ZigZag Conversion.
     * This method creates an array of strings for each row and simulates the zigzag traversal.
     * It appends characters row by row in a "downward" direction and then "upward" for middle rows.
     * This approach is straightforward but less efficient than the optimized method below.
     */
    public String convertBasic(String s, int numRows) {
        // Edge case: If only one row, the output is the same as the input.
        if (numRows == 1) {
            return s;
        }

        // Array of strings to represent each row in the zigzag pattern.
        String[] arr = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = ""; // Initialize each row as an empty string.
        }

        int i = 0; // Pointer to traverse the string.

        // Loop to fill rows in a zigzag manner.
        while (i < s.length()) {
            // Downward pass: Fill rows from top to bottom.
            for (int idx = 0; idx < numRows && i < s.length(); idx++) {
                arr[idx] += s.charAt(i++);
            }
            // Upward pass: Fill rows from bottom to second row.
            for (int idx = numRows - 2; idx > 0 && i < s.length(); idx--) {
                arr[idx] += s.charAt(i++);
            }
        }

        // Combine all rows to form the result.
        StringBuilder res = new StringBuilder();
        for (String str : arr) {
            res.append(str);
        }
        return res.toString();
    }

    /**
     * Optimized approach for ZigZag Conversion.
     * This method calculates the cycle length and directly appends characters to the result.
     * It avoids using additional arrays, making it more space-efficient.
     */
    public String convert(String s, int numRows) {
        // Edge case: If only one row, the output is the same as the input.
        if (numRows == 1) {
            return s;
        }

        // StringBuilder to hold the final result.
        StringBuilder res = new StringBuilder();

        // Calculate the cycle length (one downward and one upward pass).
        int cycleLength = 2 * numRows - 2;

        // Loop through each row to construct the zigzag pattern.
        for (int row = 0; row < numRows; row++) {
            // Traverse the string for the current row.
            for (int i = row; i < s.length(); i += cycleLength) {
                // Always append the character in the downward pass.
                res.append(s.charAt(i));

                // Append the upward pass character if applicable.
                if (row != 0 && row != numRows - 1) {
                    int upCharIndex = i + cycleLength - 2 * row;
                    if (upCharIndex < s.length()) {
                        res.append(s.charAt(upCharIndex));
                    }
                }
            }
        }
        return res.toString();
    }
}
