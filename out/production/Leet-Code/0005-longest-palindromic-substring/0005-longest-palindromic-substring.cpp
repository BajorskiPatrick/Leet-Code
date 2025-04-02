class Solution {
public:
    string longestPalindrome(string s) {
        if(s.size() == 1)
            return s;
        
        vector<pair<int, int>> palindrome_check = {};
        string longest = s.substr(0, 1);
        for(int i = 0; i < s.size() - 1; i++) {
            palindrome_check.push_back(std::make_pair(i, 1));
            if(s[i] == s[i+1]) {
                palindrome_check.push_back(std::make_pair(i, 2));
            }
        }
        palindrome_check.push_back(std::make_pair(s.size() - 1, 1));
        
        for (const auto& pair : palindrome_check) {
            longer_palindrome(pair, longest, s);
        }

        return longest;
    }

    void longer_palindrome(const pair<int, int>& to_check, string& longest, const string& s) {
        int i = 1;
        while(i <= to_check.first and (to_check.first + to_check.second - 1 + i) < s.size()) {
            if(s[to_check.first - i] != s[to_check.first + to_check.second - 1 + i])
                break;
            i++;
        }
        if(to_check.second + 2 * (i - 1) > longest.size())
            longest = s.substr(to_check.first - (i - 1), to_check.second + 2 * (i - 1));
    }
};