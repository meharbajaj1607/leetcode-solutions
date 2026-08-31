class Solution {
    public boolean isValid(String s) {
//         Deque<Character> stack = new ArrayDeque<>();

// for (char c : s.toCharArray()) {

//     if (c == '(' || c == '[' || c == '{') {
//         stack.push(c);
//     }
//     else {

//         if (stack.isEmpty()) {
//             return false;
//         }

//         char top = stack.pop();

//         if (c == ')' && top != '(' ||
//             c == ']' && top != '[' ||
//             c == '}' && top != '{') {
//             return false;
//         }
//     }
// }

// return stack.isEmpty();
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='['||c=='('||c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty())return false;
                char top = st.pop();
                if((top=='['&&c!=']')||(top=='('&&c!=')')||(top=='{'&&c!='}')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}