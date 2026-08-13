class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;

        String maxStr = s.substring(0,1);
        int maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                if (j-i >maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                    
                }
            }
        }

        return maxStr;
    }

    boolean isPalindrome (String s) {
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-1-i))
            {
                return false;
            }
        }
        

        return true;
    }
}