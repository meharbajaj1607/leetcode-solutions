class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            if(map.containsKey(key)){
                int value = map.get(key)+1;
                map.put(key,value);
            }
            else map.put(key,1);
        }
        int num=-1;
        int max = Integer.MIN_VALUE;
        for(int i: map.keySet()){
            int val = map.get(i);
            if(max<val){
                max = val;
                num = i;
            }
        }
        return num;
    }
}