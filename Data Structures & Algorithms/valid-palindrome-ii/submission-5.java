class Solution {
    public boolean validPalindrome(String s) {
       if(isPalindrome(s)){
            return true;
        }
       for(int i=0;i<s.length();i++){
        String newStr=s.substring(0,i)+s.substring(i+1);
        if(isPalindrome(newStr)){
            return true;
        }
       }
       return false;
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