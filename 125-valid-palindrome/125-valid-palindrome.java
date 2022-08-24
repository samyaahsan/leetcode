class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        int left = 0;
        int right = s.length()-1;
        
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}