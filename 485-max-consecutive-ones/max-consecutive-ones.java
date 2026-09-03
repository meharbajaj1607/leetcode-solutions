class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int ans=0;
        for(int x:nums){
            if(x==1)count++;
            else{
                ans = Math.max(ans,count);
                count=0;
            }
        }
        return Math.max(ans,count);
    }
}