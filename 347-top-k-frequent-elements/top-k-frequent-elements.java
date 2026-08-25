class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); //x,freq
        for(int x:nums){
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (a,b)->b.getValue()-a.getValue()
        );
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            pq.add(entry);
        }
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = pq.remove().getKey();
        }
        return arr;
    }
}