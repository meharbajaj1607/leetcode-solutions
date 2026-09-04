class Solution {
    public int getNum(int i,String s){
        char ch= s.charAt(i);
        if(ch=='I')return 1;
        else if(ch=='V')return 5;
        else if(ch=='X')return 10;
        else if(ch=='L')return 50;
        else if(ch=='C')return 100;
        else if(ch=='D')return 500;
        else return 1000;
    }
    public int romanToInt(String s) {
        int num = getNum(s.length()-1,s);
        for(int i=s.length()-2;i>=0;i--){
            char ch = s.charAt(i);
            char p = s.charAt(i+1);
            int n = getNum(i,s);
            if(ch=='I' && (p=='V'||p=='X')){
                num-=n;
            }
            else if(ch=='X' && (p=='L'||p=='C')){
                num-=n;
            }
            else if(ch=='C' && (p=='D'||p=='M')){
                num-=n;
            }
            else num+=n;
        }
        return num;
    }
}