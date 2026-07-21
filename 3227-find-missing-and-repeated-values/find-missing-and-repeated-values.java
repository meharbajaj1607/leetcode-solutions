class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int maxVal = grid.length*grid.length;
        int[] freq = new int[2];
        int[] arr = new int[maxVal];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                int idx = grid[i][j];
                arr[idx-1]++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1)freq[0] = (i+1);
            else if(arr[i]==0) freq[1] = (i+1);
        }
        return freq;
    }
}