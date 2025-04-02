class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char, int> converter = {
            {'I', 1},
            {'V', 5},
            {'X', 10},
            {'L', 50},
            {'C', 100},
            {'D', 500},
            {'M', 1000}
        };
        int converted_value = converter[s[s.size() - 1]];
        for(int i = s.size() - 2; i >= 0; i--) {
            if(converter[s[i]] < converter[s[i + 1]])
                converted_value -= converter[s[i]];
            else
                converted_value += converter[s[i]];
        }
        return converted_value;
    }
};