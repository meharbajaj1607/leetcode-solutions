class Solution {
    public void makeZero(int[][] matrix,int r,int c){
        for(int i=0;i<matrix[0].length;i++){
            matrix[r][i]=0;
        }
        for(int i=0;i<matrix.length;i++){
            matrix[i][c]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    List<Integer> l = new ArrayList<>();
                    l.add(i);l.add(j);
                    list.add(l);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            makeZero(matrix,list.get(i).get(0),list.get(i).get(1));
        }
    }
}