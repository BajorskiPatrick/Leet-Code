class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        // int res = 0;
        // for (int i = 0; i < dominoes.length - 1; i++) {
        //     for (int j = i + 1; j < dominoes.length; j++) {
        //         if (dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1] ||
        //         dominoes[i][0] == dominoes[j][1] && dominoes[i][1] == dominoes[j][0]) {
        //             res++;
        //         }
        //     }
        // }
        // return res;

        Map<List<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < dominoes.length; i++) {
            List<Integer> list = new ArrayList<>(Arrays.asList(dominoes[i][0], dominoes[i][1]));
            List<Integer> list2 = new ArrayList<>(Arrays.asList(dominoes[i][1], dominoes[i][0]));
            Integer curr = map.get(list);
            Integer curr2 = map.get(list2);
            if (curr == null && curr2 == null) {
                map.put(list, 1);
            }
            else if (curr != null) {
                map.put(list, curr+1);
            }
            else {
                map.put(list2, curr2+1);
            }
        }

        return map.values().stream().filter(n -> n > 1).map(n -> (n*(n-1))/2).reduce(0, Integer::sum);
    }
}