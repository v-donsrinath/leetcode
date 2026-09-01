class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char l=s.charAt(left);
            char r=s.charAt(right);
            if(!isAlpha(l)){
                left++;
            }
            else if(!isAlpha(r)){
                right--;
            }
            else{
                if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    private boolean isAlpha(char c){
             return (c>='a' && c<='z')||
             (c>='A' && c<='Z')||
             (c>='0' && c<='9');
    }

    
}