class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int bad=-1;int min=-1;int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxK||nums[i]<minK) bad=i;
            if(nums[i]==maxK)max=i;
            if(nums[i]==minK)min=i;
            ans += Math.max(0,Math.min(min,max)-bad);
        }
        return ans;
    }
}