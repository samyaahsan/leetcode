class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int curMax = 0;
        int max = 0;
        
        Set<Character> set = new HashSet<>();
        
        while (right < s.length()){
            if (!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                curMax = (right - left);
                if (curMax > max)
                    max = curMax;
            }
            else{
                set.remove(s.charAt(left));
                left++;
                curMax = 0;
            }
        }
        return max;
        
    }
}