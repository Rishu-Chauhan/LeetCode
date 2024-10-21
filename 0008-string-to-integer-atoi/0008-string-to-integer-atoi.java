class Solution {
    public int myAtoi(String s) {
        
        int i = 0, n = s.length();
        // Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Handle optional sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert digits to integer
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow/underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}