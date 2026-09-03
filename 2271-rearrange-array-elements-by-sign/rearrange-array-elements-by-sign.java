class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        for(int x:nums){
            if(x>=0) p.add(x);
            else n.add(x);
        }
        int[] arr = new int[nums.length];
        int j=0;int k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i] = p.get(j);
                j++;
            }
            else{
              arr[i] = n.get(k);
              k++;  
            } 
        }
        return arr;
    }
}