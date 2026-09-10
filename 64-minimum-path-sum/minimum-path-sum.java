class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=0;
            }
        }
        // for(int i=0;i<dp.length;i++){
        //     if(i==0)dp[0][i]=0;
        // }
        // for(int i=0;i<dp[0].length;i++){
        //     if(i==0)dp[i][0]=0;
        // }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0&&j==0) dp[i][j] = grid[i][j];
                else if(i==0) dp[i][j] = grid[0][j]+dp[0][j-1];
                else if(j==0) dp[i][j] = grid[i][0]+dp[i-1][0];
                else dp[i][j] = grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}