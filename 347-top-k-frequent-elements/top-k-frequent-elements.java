class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // 1. Count frequency
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // 2. Max heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }

        // 3. Take top k
        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = pq.poll().getKey();
        }

        return arr;
    }
}