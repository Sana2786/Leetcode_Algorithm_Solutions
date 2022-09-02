#Runtime: 49 ms, faster than 56.12% of Java online submissions for Longest Palindromic Substring.
class Solution {
    public String longestPalindrome(String s) {
        StringBuilder ans= new StringBuilder();
        int n = s.length();
        int resL = 0;
        for(int i = 0; i < n; i++){
            int j = i;
            int k = i;
            
            while(j >= 0 && k < n){
                if(s.charAt(j) != s.charAt(k)){
                    break;
                }
                if(ans.length() < k-j+1)
              {
                ans = new StringBuilder(s.substring(j,k+1));
              }
                j--;
                k++;
            }
            
            j = i;
            k = i+1;
            while(j >= 0 && k < n){
                if(s.charAt(j) != s.charAt(k)){
                    break;
                }
                if(ans.length() < k-j+1)
              {
                ans = new StringBuilder(s.substring(j,k+1));
                        
              }
                j--;
                k++;
            }
           
        }
        
        return ans.toString();
    }
}
