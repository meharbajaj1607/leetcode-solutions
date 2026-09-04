class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x:s.toCharArray()){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else map.put(x,1);
        }
        List<Character> keys = new ArrayList<>(map.keySet());
        keys.sort((a, b) -> map.get(b) - map.get(a));
        StringBuilder sb = new StringBuilder();
        for(char key:keys){
            int freq = map.get(key);
            for(int i=0;i<freq;i++){
                sb.append(key);
            }
        }
        return sb.toString();
    }
}