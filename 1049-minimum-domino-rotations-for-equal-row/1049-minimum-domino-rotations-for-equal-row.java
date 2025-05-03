class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int len = tops.length;
        int min = len;
        int[] topOccurs = new int[7];
        int[] bottomOccurs = new int[7];
        int[] commonOccurs = new int[7];
        for (int i = 0; i < len; i++) {
            topOccurs[tops[i]]++;
            bottomOccurs[bottoms[i]]++;
            if (tops[i] == bottoms[i]) {
                commonOccurs[tops[i]]++;
            }
        }

        for (int i = 0; i < 7; i++) {
            if (topOccurs[i] + bottomOccurs[i] - commonOccurs[i] == len) {
                return Math.min(topOccurs[i], bottomOccurs[i]) - commonOccurs[i];
            }
        }

        return -1;
    }
}