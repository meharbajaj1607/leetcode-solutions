class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int i=0;int j=0;
        while( j<s.length()){
            char ch = s.charAt(j);
            if(s.substring(i,j).contains(ch+"")){
                i++;
            }else j++;
            len=Math.max(len,j-i);
        }
        return len;
    }
}