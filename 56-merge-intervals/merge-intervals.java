class Solution {
    public int[][] merge(int[][] matrix) {
        Arrays.sort(matrix, (a, b) -> a[0] - b[0]);//ascending order on basis of 0th ele
        int[] start = new int[matrix.length];
        int[] end = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            start[i] = matrix[i][0]; 
            end[i] = matrix[i][1];   
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int e = end[0];int S = start[0];
        for(int i=1;i<matrix.length;i++){
            int s = start[i];
            if(s>e){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(S);
                arr.add(e);
                list.add(arr);
                S = s; 
                e = end[i];
            }else e = Math.max(end[i],e);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(S);
        arr.add(e);
        list.add(arr);
        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }
        return ans;
    }
}