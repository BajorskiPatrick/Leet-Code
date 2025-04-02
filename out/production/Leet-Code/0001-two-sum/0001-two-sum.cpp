class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        /**for(int i=0; i< nums.size() - 1; i++) {
            for(int j=i+1; j< nums.size(); j++) {
                if(nums[i] + nums[j] == target) {
                    return {i, j};
                }
            }
        }
        return {};
        **/

        unordered_map<int, int> complements_map;
        for(int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];
            if(complements_map.count(complement))
                return {complements_map[complement], i};
            complements_map[nums[i]] = i;
        }
        return {};
    }
};