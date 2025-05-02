class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        String s = Integer.toString(x);
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            else {
                return false;
            }
        }
        return true;

        // if (x < 0) {
        //     return false;
        // }

        // int i = 1;
        // int n = 1;
        // while (i < x) {
        //     i *= 10;
        //     n++;
        // }
        // i /= 10;
        // n--;

        // char[] digits = new char[n+1];
        // while (i >= 1) {
        //     int tmp = x / i;
        //     x -= i * tmp;
        //     i /= 10;
        //     char[n] = x;
        //     n--;
        // }

    }
}