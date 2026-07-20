class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                int freq = map.get(arr[i])+1;
                map.put(arr[i],freq);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer value : map.values()) {
            if(set.contains(value)) return false;
            else set.add(value);
        }
        return true;
    }
}