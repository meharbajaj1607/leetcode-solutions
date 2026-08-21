class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(intervals[i][0]);
            arr.add(intervals[i][1]);
            matrix.add(arr);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(newInterval[0]);
        arr.add(newInterval[1]);
        matrix.add(arr);
        Collections.sort(matrix, (a, b) -> a.get(0) - b.get(0));
        int[] start = new int[matrix.size()];
        int[] end = new int[matrix.size()];
        for(int i=0;i<matrix.size();i++){
            start[i] = matrix.get(i).get(0); 
            end[i] = matrix.get(i).get(1);   
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int S = start[0];
        int e = end[0];
        for(int i=1;i<matrix.size();i++){
            int s = start[i];
            if(s>e){
                arr = new ArrayList<>();
                arr.add(S);
                arr.add(e);
                list.add(arr);
                S = s; 
                e = end[i];
            }else e = Math.max(end[i],e);
        }
        arr = new ArrayList<>();
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