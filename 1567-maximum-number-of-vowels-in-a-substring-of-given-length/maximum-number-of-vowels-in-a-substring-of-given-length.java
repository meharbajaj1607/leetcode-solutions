class Solution {
    public int maxVowels(String s, int k) {
        int max = Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        if(count>max) max=count;
        for(int i=k;i<s.length();i++){
            int firstChar = s.charAt(i-k);
            if(firstChar=='a'||firstChar=='e'||firstChar=='i'||firstChar=='o'||firstChar=='u') count--;
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}