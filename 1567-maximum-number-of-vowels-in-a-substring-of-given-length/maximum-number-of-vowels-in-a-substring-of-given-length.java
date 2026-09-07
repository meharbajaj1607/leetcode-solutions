class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int left=0;
        int c=0;
        for(int right=0;right<s.length();right++){
            char ch = Character.toLowerCase(s.charAt(right));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c++;
            }
            if(k==right-left+1){
                count = Math.max(count,c);
                char leftChar = Character.toLowerCase(s.charAt(left));
                if (leftChar == 'a' || leftChar == 'e' ||
                    leftChar == 'i' || leftChar == 'o' ||
                    leftChar == 'u') {
                    c--;
                }
                left++;
            }
        }
        return count;
    }
}