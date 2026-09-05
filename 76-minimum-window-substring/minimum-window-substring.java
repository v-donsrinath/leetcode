class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> tMap=new HashMap<>();
        for(char c:t.toCharArray()){
            tMap.put(c,tMap.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> sMap=new HashMap<>();
        String ans="";
        int l=0;
        int count =t.length();
        int minlen=Integer.MAX_VALUE;

        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            sMap.put(ch,sMap.getOrDefault(ch,0)+1);
            
            if(tMap.containsKey(ch) && sMap.get(ch)<=tMap.get(ch)){
                count--;
            }

            while(count==0){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    ans=s.substring(l,r+1);
                }
                char leftchar=s.charAt(l);
                sMap.put(leftchar,sMap.get(leftchar)-1); //decreasing the frequency
                
                if(tMap.containsKey(leftchar) && sMap.get(leftchar)<tMap.get(leftchar)){
                    count++;
                }
                l++;
            }
        }
        return ans;
    }

}