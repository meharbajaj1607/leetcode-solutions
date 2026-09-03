class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        TreeSet<Integer> set = new TreeSet<>();

        for (int x : nums) {
            set.add(x);
        }

        List<Integer> arr = new ArrayList<>(set);

        int count = 1;
        int ans = 1;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == arr.get(i - 1) + 1) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 1;
            }
        }

        return Math.max(ans, count);
    }
}
