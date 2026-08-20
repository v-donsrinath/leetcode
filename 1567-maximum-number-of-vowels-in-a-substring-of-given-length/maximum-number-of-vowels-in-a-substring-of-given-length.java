class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int count=0;
        int ans=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
                if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                    count++;
                }
                if(r-l+1>k){
                    char chleft=s.charAt(l);
                    if(chleft=='a'|| chleft=='e'|| chleft=='i'|| chleft=='o'|| chleft=='u'){
                    count--;
                    }
                    l++;
                }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}