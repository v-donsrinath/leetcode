class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=0;
        long ans=0;
        long temp=0;
        
        for(int r=0;r<nums.length;r++){
            int val=nums[r];
            temp+=nums[r];
            hm.put(val,hm.getOrDefault(val,0)+1);
            if(r-l+1>k){
                temp-=nums[l]; 
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0){
                    hm.remove(nums[l]);
                }
                l++;
            }
            if(r-l+1==k && hm.size()==k){
                ans=Math.max(ans,temp);
            }
        } 
        return ans;
    }
}