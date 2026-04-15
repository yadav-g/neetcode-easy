class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> pairMap=new HashMap<>();
        ArrayList<Character> list=new ArrayList<>();
        int idx=-1;
        pairMap.put('}','{');
        pairMap.put(']','[');
        pairMap.put(')','(');
        for(char c:s.toCharArray()){
            if(c!='}'&&c!=']' && c!=')'){
                list.add(c);
                idx++;
            }else if(idx==-1 || pairMap.get(c)!=list.get(idx)){
                return false;
            }else{
                list.remove(idx);
                idx--;
            }
        }
        return idx<0;
    }
}
