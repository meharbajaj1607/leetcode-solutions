class Solution {
    public static int climbingStairsMemoization(int n,int[] dp){
        if(n==1||n==0)return 1;
        if(dp[n]!=0)return dp[n];
        return dp[n]=climbingStairsMemoization(n-1,dp)
                    +climbingStairsMemoization(n-2,dp);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return climbingStairsMemoization(n,dp);
    }
}