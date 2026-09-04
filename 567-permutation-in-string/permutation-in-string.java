class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int l=0;
        int count=s1.length();

        for(int r=0;r<s2.length();r++){
            char ch=s2.charAt(r);

            int val=map.getOrDefault(ch,0);
            if(val>0){
                count--;
            }
            map.put(ch,val-1);
            

            if(count==0){
                return true;
            }

            if(r-l+1==s1.length()){
                char leftChar=s2.charAt(l);

                int leftVal=map.get(leftChar);
                if(leftVal>=0){
                    count++;
                }
                map.put(leftChar,leftVal+1);
                l++;
            }
        }
        return false;
    }
}