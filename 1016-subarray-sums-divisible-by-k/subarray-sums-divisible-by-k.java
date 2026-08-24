class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int prefixsum=0;
        for(int val:nums){
            prefixsum+=val;
            int rem=prefixsum%k;
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);       
        }
        return count;   
    }
}