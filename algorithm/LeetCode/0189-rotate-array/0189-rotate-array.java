class Solution {
    
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        if (k == 0) return; // Rotated array will be same as original array
        reverse(0, nums.length-1, nums); // Step 1: Reverse the entire array
        reverse(0, k-1, nums); // Step 2: Reverse 0 to k-1 elements
        reverse(k, nums.length-1, nums); // Step 3: Reverse from k to n-1 elements
    }
    
    private void reverse(int start, int end, int[] nums){        
        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}