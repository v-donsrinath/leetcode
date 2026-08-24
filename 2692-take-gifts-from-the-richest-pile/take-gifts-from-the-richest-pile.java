class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<gifts.length;i++){
            int val=gifts[i];
            pq.add(val);
        }
        for(int i=0;i<k;i++){
            int max=pq.poll();
            int val=(int) Math.sqrt(max);
            pq.add(val);
        }
        long ans=0;
        for(int i:pq){
            ans+=i;
        }
        return ans;

    }
}