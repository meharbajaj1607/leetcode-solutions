class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<bulbs.size();i++){
            int b = bulbs.get(i);
            if(map.containsKey(b)){
                map.put(b,map.get(b)+1);
            }else map.put(b,1);
        }
        List<Integer> l = new ArrayList<>();
        for(int b : map.keySet()){
            if(map.get(b)%2!=0) l.add(b);
        }
        return l;
    }
}