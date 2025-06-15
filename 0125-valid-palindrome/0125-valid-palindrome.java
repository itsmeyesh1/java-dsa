class Solution {
    public boolean isPalindrome(String s) {
        int  n=s.length()-1;
        int left=0,right=n;
        while(left<right) {
            while(left<right && !isalphaNum(s.charAt(left))){
                left++;
            }
            while(right>left && !isalphaNum(s.charAt(right))) {
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;right--;
        }
        return true;
    }
    public boolean isalphaNum(char c) {
        return(  c>='A' && c<='Z' ||
                 c>='a' && c<='z' ||
                 c>='0' && c<='9' );
    }
}