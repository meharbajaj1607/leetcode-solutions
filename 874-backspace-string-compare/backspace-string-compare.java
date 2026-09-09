class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='#'){
                if(s1.length()>0)s1.deleteCharAt(s1.length()-1);
                else continue;
            }
            else s1.append(ch);
        }
        StringBuilder t1 = new StringBuilder();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch=='#'){
                if(t1.length()>0)t1.deleteCharAt(t1.length()-1);
                else continue;
            }
            else t1.append(ch);
        }
        System.out.println(s1+" "+t1);
        return s1.toString().equals(t1.toString());
    }
}