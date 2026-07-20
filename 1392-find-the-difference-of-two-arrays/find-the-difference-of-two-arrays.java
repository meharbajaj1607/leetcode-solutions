class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int x : nums1)
            set1.add(x);

        for (int x : nums2)
            set2.add(x);
        HashSet<Integer> s1 = new HashSet<>();
        for(int e:set1){
            if(!set2.contains(e)){
                s1.add(e);
            }
        }
        HashSet<Integer> s2 = new HashSet<>();
        for(int e:set2){
            if(!set1.contains(e)){
                s2.add(e);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(s1));
        result.add(new ArrayList<>(s2));
        return result;
    }
}