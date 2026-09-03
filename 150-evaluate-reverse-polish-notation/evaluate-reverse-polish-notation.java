class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String x:tokens){
            if (!x.equals("+") && !x.equals("-") && !x.equals("*") && !x.equals("/")){
                st.push(Integer.parseInt(x));
            }
            else{
                int x1=st.pop();
                int x2=st.pop();
                if(x.equals("+")) st.push(x1+x2);
                else if(x.equals("-"))st.push(x2-x1);
                else if(x.equals("*"))st.push(x1*x2);
                else st.push(x2/x1);
            }
        }
        return st.pop();
    }
}