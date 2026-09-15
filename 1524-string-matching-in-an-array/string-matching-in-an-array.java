class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> arr = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].contains(words[j])){
                    if(!arr.contains(words[j]))arr.add(words[j]);
                }
                else if(words[j].contains(words[i])){
                    if(!arr.contains(words[i]))arr.add(words[i]);
                }
            }
        }
        return arr;
    }
}