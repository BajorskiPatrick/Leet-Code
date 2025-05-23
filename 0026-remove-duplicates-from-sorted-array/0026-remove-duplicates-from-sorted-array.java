class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 0;
        for (; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}