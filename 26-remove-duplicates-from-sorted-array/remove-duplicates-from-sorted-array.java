class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int count=0;
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                count++;
            }
            else nums[i] = Integer.MAX_VALUE;
        }
        Arrays.sort(nums);
        return count;
    }
}
