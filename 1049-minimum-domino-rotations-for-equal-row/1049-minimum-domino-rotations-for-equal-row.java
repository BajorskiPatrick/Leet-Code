class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int len = tops.length;
        int min = len;
        for (int i = 1; i <= 6; i++) {
            int topCounter = 0;
            int bottomCounter = 0;
            int common = 0;
            for (int j = 0; j < len; j++) {
                if (tops[j] == bottoms[j] && tops[j] == i) {
                    common++;
                    continue;
                }
                if (tops[j] == i) {
                    topCounter++;
                }
                if (bottoms[j] == i) {
                    bottomCounter++;
                }
            }
            if (topCounter + bottomCounter + common == len) {
                min = Math.min(min, Math.min(topCounter, bottomCounter));
                if (min == 0) {
                    break;
                }
            }
        }

        return min < len ? min : -1;
    }
}