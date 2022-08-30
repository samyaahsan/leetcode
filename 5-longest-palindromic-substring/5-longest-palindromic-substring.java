
class Solution {
    private int begins, maxLength;
    
    public String longestPalindrome(String s) {
        
        if (s.length() < 2)
            return s;
        
        for (int i = 0; i < s.length()-1; i++){
            expandPalindrome(s, i, i); //odd
            expandPalindrome(s, i, i+1); //even
        }
        return s.substring(begins, begins + maxLength);
        
    }
    
    private void expandPalindrome(String s, int start, int end){
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        if (end-start-1 > maxLength){
            begins = start+1;
            maxLength = end - start - 1;
        }
    }
}
