class Solution {
    public int maxSubArray(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        int min = 0;
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = nums[i]+prefix[i-1];
        }
        for(int i=0;i<nums.length;i++){
            max = Math.max(prefix[i]-min,max);
            min = Math.min(min,prefix[i]);
        }
        return max;
    }
}