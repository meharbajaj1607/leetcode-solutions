class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] list = new int[2];
        for(int i=0;i<numbers.length;i++){
            int c = target - numbers[i];
            if(map.containsKey(c)){
                list[0] = i+1;list[1] = map.get(c)+1;
                Arrays.sort(list);
                return list;
            }
            map.put(numbers[i],i);
        }
        return list;
    }
}