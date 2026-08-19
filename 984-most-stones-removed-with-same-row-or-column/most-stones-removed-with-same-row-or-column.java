class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        boolean[] visited = new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(visited,i,stones);
            }
        }
        return n-count;
    }
    public void dfs(boolean[] visited,int i,int[][]stones){
        visited[i] = true;
        for (int j = 0; j < stones.length; j++) {
            if (!visited[j]) {
                // Same row OR same column
                if (stones[i][0] == stones[j][0] ||
                    stones[i][1] == stones[j][1]) {

                    dfs(visited,j,stones);
                }
            }
        }
    }
}