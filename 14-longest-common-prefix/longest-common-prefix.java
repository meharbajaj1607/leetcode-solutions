class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        String mins = "";
        for(String s:strs){
            if(min>s.length()){
                min = s.length();
                mins = s;
            }
        }
        int j = mins.length();
        while(j>=0){
            boolean found = true;
            String s = mins.substring(0,j);
            for(String str:strs){
                if(!str.startsWith(s)) {
                    found=false;
                    break;
                }
            }
            if(found)return mins.substring(0,j);;
            j--;
        }
        return "";
    }
}