class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            int k = target - nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(k == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
                
        return new int[]{};
    }
}