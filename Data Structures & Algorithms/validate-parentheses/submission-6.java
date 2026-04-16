class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> pairMap=new HashMap<>();
        pairMap.put('}','{');
        pairMap.put(']','[');
        pairMap.put(')','(');
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(pairMap.containsKey(c)){
                if(!st.isEmpty() && st.peek()==pairMap.get(c)){
                    st.pop();
                }else{
                    return false;
                }
            }else{
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}
