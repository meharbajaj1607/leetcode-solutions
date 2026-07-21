class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            if(map.containsKey(key)){
                int value = map.get(key);
                map.put(key,value+1);
            }
            else{
                map.put(key,1);
            }
        }
        for(int i:map.keySet()){
            int v = map.get(i);
            if(v==1) return i;
        }
        return -1;
    }
}