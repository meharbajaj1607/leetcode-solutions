class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<String> str = new ArrayList<>();
        // HashMap<String,List<String>> map = new HashMap<>();
        // for(int i=0;i<strs.length;i++){
        //     char[] arr = strs[i].toCharArray();
        //     Arrays.sort(arr);
        //     str.add(Arrays.toString(arr));
        // }
        // for(int i=0;i<strs.length;i++){
        //     if(map.containsKey(str.get(i))){
        //         map.get(str.get(i)).add(strs[i]);
        //     }
        //     else{
        //         ArrayList<String> l = new ArrayList<>();
        //         l.add(strs[i]);
        //         map.put(str.get(i),l);
        //     }
        // }
        // List<List<String>> list = new ArrayList<>();
        // for(String key:map.keySet()){
        //     list.add(map.get(key));
        //}
        //return list;
        String[] s = new String[strs.length];
        for(int i=0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            s[i] = Arrays.toString(arr);
        }
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            if(map.containsKey(s[i])){
                map.get(s[i]).add(strs[i]);
            }
            else{
                ArrayList<String> l = new ArrayList<>();
                l.add(strs[i]);
                map.put(s[i],l);
            }
        }
        List<List<String>> list = new ArrayList<>();
        for(String key:map.keySet()){
            list.add(map.get(key));
        }
        return list;
    }
}