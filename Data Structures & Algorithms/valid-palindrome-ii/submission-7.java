class Solution {
    public boolean validPalindrome(String s) {
       int start=0;
       int end=s.length()-1;
       while(start<end){
        if(s.charAt(start)!=s.charAt(end)){
            return isPalindrome(s.substring(0,start)+s.substring(start+1))||isPalindrome(s.substring(0,end)+s.substring(end+1));
        }
        start++;
        end--;
       }
       return true;
    }
    public boolean isPalindrome(String original){
        int l=0;
        int r=original.length()-1;
        while(l<r){
            if(original.charAt(l)!=original.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}