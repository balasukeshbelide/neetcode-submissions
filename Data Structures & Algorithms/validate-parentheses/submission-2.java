class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()) return true;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '{' || c == '(') {
                st.push(c);
            } else {
                if(c==']' && (st.isEmpty() || st.pop()!='[')) return false;
                if(c==')' && (st.isEmpty() || st.pop()!='(')) return false;
                if(c=='}' && (st.isEmpty() || st.pop()!='{')) return false;
            }
        }
        if(st.isEmpty())
        return true;
        return false;
    }
}
