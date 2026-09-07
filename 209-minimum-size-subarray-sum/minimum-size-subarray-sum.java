class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum = sum + nums[right]; 
            while(sum >= target){
                l = Math.min(l,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(l==Integer.MAX_VALUE) l=0;
        return l;
    }
}