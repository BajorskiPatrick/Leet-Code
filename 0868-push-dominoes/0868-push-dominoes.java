class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int i = 0;
        char[] domArray = dominoes.toCharArray();
        while (i < n) {
            char state = domArray[i];
            int newIterator;
            if (state == 'L' || state == 'R') {
                i++;
                continue;
            }
            else {
                int j = i + 1;
                i--;
                while (j < n && domArray[j] == '.') {
                    j++;
                }
                newIterator = j;
                if (i < 0 && j == n) {
                    break;
                }
                else if (j == n) {
                    while (i < n-1 && domArray[i] == 'R') {
                        i++;
                        domArray[i] = 'R';
                    }
                }
                else if (i < 0) {
                    while (j > 0 && domArray[j] == 'L') {
                        j--;
                        domArray[j] = 'L';
                    }
                }
                else {
                    while (i < j-2) {
                        if (domArray[i] != 'R' && domArray[j] != 'L') {
                            i++;
                            j--;
                            break;
                        }
                        
                        if (domArray[i] == 'R') {
                            i++;
                            domArray[i] = 'R';
                        }
                        
                        if (domArray[j] == 'L') {
                            j--;
                            domArray[j] = 'L';
                        }

                        
                    }

                    if (i == j-2) {
                        if (i >= 0) {
                            if (domArray[i] == 'R' && domArray[j] == 'R') {
                                i++;
                                domArray[i] = 'R';
                            }
                            else if (domArray[i] == 'L' && domArray[j] == 'L') {
                                i++;
                                domArray[i] = 'L';
                            }
                        }
                        else {
                            if (domArray[j] == 'L') {
                                j--;
                                domArray[j] = 'L';
                            }
                        }
                    }
                }

                i = newIterator;
            }
        }

        return new String(domArray);
    }
}