class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int idx=nums.length;
        while(l<=r){
            int m = l+(r-l)/2;
            if(target==nums[m])return m;
            else if(target<nums[m]){
                r = m-1;
                idx = m;
                System.out.println(idx);
            }
            else{
                l = m+1;
            }
        }
        return idx;
    }
}