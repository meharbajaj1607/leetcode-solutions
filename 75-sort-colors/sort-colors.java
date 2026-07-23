class Solution {
    public int partition(int[] nums,int l,int r){
        int p = nums[r];
        int i=l-1;
        for(int j=l;j<r;j++){
            if(nums[j]<p){
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = nums[r];
        nums[r] = temp;
        return i+1;
    }
    public void quickSort(int[] nums,int l,int r){
        if(l<r){
            int p = partition(nums,l,r);
            quickSort(nums,l,p-1);
            quickSort(nums,p+1,r);
        }
    }
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }
}