class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int val:nums){
            pq.add(val);
        }
        int arr[]=new int[nums.length];
        int j=0;
        while(!pq.isEmpty()){
           int alice= pq.poll();
           int bob=pq.poll();
           arr[j]=bob;
           j++;
           arr[j]=alice;
           j++;
        }
        return arr;
    }
}