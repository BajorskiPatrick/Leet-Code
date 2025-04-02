class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> char_map = {};
        int i = 0;
        int start = 0;
        int max_length = 0;
        int current_length = 0;
        while(i < s.size()) {
            char ascii = s[i];
            auto it = char_map.find(ascii);
            int j = char_map[ascii];
            if(it != char_map.end() and j >= start) {
                max_length = max(max_length, current_length);
                current_length = i - j;
                start = j + 1;
            }
            else 
                current_length++;
            
            char_map[ascii] = i;
            i++;
        }
        return max(max_length, current_length);
    }
};