class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int n = haystack.length();
        int m = needle.length();
        if (n < m) {
            return -1;
        }
        while (i <= n-m) {
            int j = 0;
            if (haystack.charAt(i++) == needle.charAt(j++)) {
                int start = i-1;
                while (i < n && j < m && haystack.charAt(i) == needle.charAt(j)) {
                    i++;
                    j++;
                }
                if (j == m) {
                    return start;
                }
                else {
                    i = start + 1;
                }
            }
        }
        return -1;
    }
}