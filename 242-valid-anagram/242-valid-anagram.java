class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str = s.toCharArray();
        char[] tsr = t.toCharArray();
        
        Arrays.sort(str);
        Arrays.sort(tsr);
        int len = 0;
        if (str.length < tsr.length || str.length > tsr.length){
            return false;
        }
        
        
        for (int i = 0; i < str.length; i++){
            if (str[i] != tsr[i])
                return false;
        }
        return true;
        
    }
}