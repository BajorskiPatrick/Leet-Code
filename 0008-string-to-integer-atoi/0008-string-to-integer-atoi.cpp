class Solution {
public:
    int myAtoi(string s) {
        int counterBegin = 0;
        int counterEnd = 0;
        int signChecker = 1;
        while(counterBegin < s.size() and s[counterBegin] == ' ')
            counterBegin++;
        
        if(counterBegin < s.size() and s[counterBegin] == '-') {
            signChecker = -1;
            counterBegin++;
        }
        else if(counterBegin < s.size() and s[counterBegin] == '+')
            counterBegin++;
        
        while(counterBegin < s.size() and s[counterBegin] == '0')
            counterBegin++;
        
        counterEnd = counterBegin;
        while(counterEnd < s.size() and isdigit(static_cast<unsigned char>(s[counterEnd]))) {
            counterEnd++;
        }

        if(counterEnd == counterBegin)
            return 0;
        else if(counterEnd - counterBegin < 10)
            return signChecker * stoi(s.substr(counterBegin, counterEnd - counterBegin));
        else if(counterEnd - counterBegin > 10) {
            if(signChecker == -1)
                return INT_MIN;
            return INT_MAX;
        }
        else {
            string int_max = "2147483647";
            string int_min = "2147483648";
            if(signChecker == 1) {
                for(int i = 0; i < 10; i++) {
                    if(s[counterBegin + i] < int_max[i])
                        return signChecker * stoi(s.substr(counterBegin, counterEnd - counterBegin));
                    else if(s[counterBegin + i] > int_max[i]) {
                        return INT_MAX;
                    }
                }
                return INT_MAX;
            }
            else {
                for(int i = 0; i < 10; i++) {
                    if(s[counterBegin + i] < int_min[i])
                        return signChecker * stoi(s.substr(counterBegin, counterEnd - counterBegin));
                    else if(s[counterBegin + i] > int_min[i]) {
                        return INT_MIN;
                    }
                }
                return INT_MIN;
            }
        }
    }
};