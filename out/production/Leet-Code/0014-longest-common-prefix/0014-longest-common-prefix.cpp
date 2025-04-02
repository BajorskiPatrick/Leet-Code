class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int min_size = INT_MAX;
        for(int i = 0; i < strs.size(); i++) {
            if(strs[i].size() < min_size)
                min_size = strs[i].size();
        }
        int length = 0;
        char letter = ' ';
        int checker = 1;
        while(length < min_size) {
            letter = strs[0][length];
            for(int j = 1; j < strs.size(); j++) {
                if(letter != strs[j][length])
                    checker = 0;
            }
            if(checker == 0)
                break;
            length++;
        }
        return strs[0].substr(0, length);
    }
};