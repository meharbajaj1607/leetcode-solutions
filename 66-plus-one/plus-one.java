class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> digit = new ArrayList<>();
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            int d = digits[i]+carry;
            carry = d/10;
            d = d%10;
            digit.add(0,d);
        }
        if (carry == 1) {
            digit.add(0, 1);
        }

        int[] ans = new int[digit.size()];
        for (int i = 0; i < digit.size(); i++) {
            ans[i] = digit.get(i);
        }

        return ans;
    }
}