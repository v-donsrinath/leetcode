class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           hm.put(ch,hm.getOrDefault(ch,0)+1);
        } 

        PriorityQueue<Freq> pq=new PriorityQueue<>((a,b) -> b.key-a.key );
        for(char ch:hm.keySet()){
            pq.add(new Freq(ch,hm.get(ch)));
        }

        StringBuilder ans=new StringBuilder();
        while(!pq.isEmpty()){
            Freq top=pq.poll();
            char ch=top.key;
            int count=top.val;
            int counttobeadded=Math.min(count,repeatLimit);
            for(int i=0;i<counttobeadded;i++){
                ans.append(ch);
            }
            if(count>repeatLimit){
                if(pq.isEmpty()){
                    break;
                }
                Freq top2=pq.poll();
                char ch2=top2.key;
                int count2=top2.val;
                ans.append(ch2);
                count2--;
                if(count2>0){
                    pq.add(new Freq(ch2,count2));
                }
                pq.add(new Freq(ch,count-repeatLimit));
            }
        }
        return ans.toString();  
    }
}
class Freq{
    char key;
    int val;
    Freq(char key,int val){
        this.key=key;
        this.val=val;
    }
}