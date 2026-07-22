class Solution {
    public boolean isPalindrome(int x) {
        String s = x+"";
        int pt1=0;int pt2 =s.length()-1;
        while(pt1<pt2){
            if(s.charAt(pt1)!=s.charAt(pt2))return false;
            pt1++;
            pt2--;
        } 
        return true;
    }
}