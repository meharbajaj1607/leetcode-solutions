class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> set = new PriorityQueue<>((a,b)->b-a);
        for(int x:nums){
            set.add(x);
        }
        int n = -1;
        for(int i=0;i<k;i++){
            n = set.poll();
            System.out.println(n);
        }
        return n;
    }
}