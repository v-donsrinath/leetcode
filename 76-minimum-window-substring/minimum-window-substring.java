class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> tMap=new HashMap<>();
        for(char c:t.toCharArray()){
            tMap.put(c,tMap.getOrDefault(c,0)+1);
        }
        
        
        int l=0;
        int count =t.length();
        int minlen=Integer.MAX_VALUE;
        String ans="";

        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
           
            if(tMap.containsKey(ch)){
                if(tMap.get(ch)>0){
                    count--;
                }
                tMap.put(ch,tMap.get(ch)-1);//frequency is decresed in both case ony count changes for special case
            }

            while(count==0){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    ans=s.substring(l,r+1);
                }
                char leftchar=s.charAt(l);
                if(tMap.containsKey(leftchar)){
                    tMap.put(leftchar,tMap.get(leftchar)+1);
                    if(tMap.get(leftchar)>0){
                        count++;
                    }
                }
                l++;
            }
        }
        return ans;
    }
}
                
              