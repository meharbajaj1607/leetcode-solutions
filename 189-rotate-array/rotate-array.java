class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int j=0;j<nums.length;j++){
            int idx = (j+k)%nums.length;
            arr[idx] = nums[j];
        }
        for(int j=0;j<nums.length;j++){
            nums[j] = arr[j];
        }
    }
}