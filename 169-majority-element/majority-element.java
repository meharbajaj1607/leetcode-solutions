class Solution {
    // public int majorityElement(int[] nums) {
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         int key = nums[i];
    //         if(map.containsKey(key)){
    //             int value = map.get(key)+1;
    //             map.put(key,value);
    //         }
    //         else map.put(key,1);
    //     }
    //     int num=-1;
    //     int max = Integer.MIN_VALUE;
    //     for(int i: map.keySet()){
    //         int val = map.get(i);
    //         if(max<val){
    //             max = val;
    //             num = i;
    //         }
    //     }
    //     return num;
    int majorityElement(int arr[]) {
         int n=arr.length;
    int candidate = arr[0], count = 1;
    for (int i = 1; i < n; i++) {
        if (count == 0) { candidate = arr[i]; count = 1; }
        else if (arr[i] == candidate) count++;
        else count--;
    }
    int actual = 0;
    for (int i = 0; i < n; i++) if (arr[i] == candidate) actual++;
    return (actual > n / 2) ? candidate : -1;
}
    
}