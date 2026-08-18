class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String w:words){
            if(map.containsKey(w))map.put(w,map.get(w)+1);
            else map.put(w,1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); // higher frequency first
            }
            return a.getKey().compareTo(b.getKey()); // smaller lexicographical first
        });

        for(Map.Entry<String,Integer> entry: map.entrySet()){
            pq.add(entry);
        }
        List<String> arr = new ArrayList<>();
        for(int i=0;i<k;i++){
            arr.add(pq.poll().getKey());
        }
        return arr;
    }
}