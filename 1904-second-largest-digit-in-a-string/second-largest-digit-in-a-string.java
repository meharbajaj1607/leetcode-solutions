class Solution {
    public int secondHighest(String s) {
        int n=-1;
        TreeSet<Integer> set = new TreeSet<>((a,b)->b-a);
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                set.add(c-'0');
            }
        }
        if(set.size()<2)return n;
        set.pollFirst();
        return set.pollFirst();
    }
}