class Solution {
    public int bin(int[] nums,int l,int r,int t){
        if (l > r) return -1;
        int m = l+(r-l)/2;
        if(nums[m]==t)return m;
        if(t<nums[m])return bin(nums,l,m-1,t);
        else return bin(nums,m+1,r,t);
    }
    public int search(int[] nums, int target) {
        return bin(nums,0,nums.length-1,target);
    }
}
