class Solution {
    public int binSearch(int nums[], int target,int l,int r){
        if(l>r) return -1;
        int mid = l + (r - l) / 2;
        if(target == nums[mid]) return mid;
        else if(nums[mid]>target) return binSearch(nums, target, l,mid-1);
        else return binSearch(nums, target,mid+1,r);
    }
    public int search(int[] nums, int target) {
        int idx = -1;
        Arrays.sort(nums);
        return binSearch(nums,target,0,nums.length-1);
    }
}