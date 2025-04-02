class Solution {
public:
    int reverse(int x) {
        if(x > -10 and x < 10)
            return x;
        string number = to_string(x);
        string reversed = "";
        int zeros_at_end = 0;
        int sign_checker = 0;
        for(int i = number.size() - 1; i >= 0; i--) {
            if(number[i] != '0')
                break;
            zeros_at_end++;
        }

        if(x >= 0) {
            sign_checker = 1;
            for(int i = number.size() - 1 - zeros_at_end; i >= 0; i--) {
                reversed += number[i];
            }
        }
        else {
            sign_checker = -1;
            for(int i = number.size() - 1 - zeros_at_end; i >= 1; i--) {
                reversed += number[i];
            }
        }

        try {
            return sign_checker * std::stoi(reversed);
        }
        catch (std::out_of_range& e) {
            return 0;
        }
    }
};