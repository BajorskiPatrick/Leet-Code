class Solution {
public:
    string convert(string s, int numRows) {
        if(s.size() <= numRows or numRows == 1)
            return s;
        
        string converted = {};
        vector<string> rows_string(numRows, "");
        int diff = 2 * numRows - 2;
        int fullPaternNum = floor(s.size() / diff) + 1;
        int checker = 1;

        for(int j = 0; j < fullPaternNum; j++) {
            for(int i = 0; i < numRows; i++) {
                if(i + j * diff >= s.size()) {
                    checker = 0;
                    break;
                }
                rows_string[i] += s[i + j * diff];
            }
            for(int i = numRows - 2; i > 0; i--) {
                if((j + 1) * diff - i >= s.size()) {
                    checker = 0;
                    break;
                }
                rows_string[i] += s[(j + 1) * diff - i];
            }
            if(checker == 0)
                break;
        }

        for(int i = 0; i < numRows; i++)
            converted += rows_string[i];
        
        return converted;      
    }
};


//jeden wzór zajmuje 2 * numRows - 2