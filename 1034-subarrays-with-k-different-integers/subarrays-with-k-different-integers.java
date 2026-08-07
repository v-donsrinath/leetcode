class Solution {
    public int atmost(int[] nums,int k){
        int l=0;
        int n=nums.length;
        int val=0;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int r=0;r<n;r++){
            val=nums[r];
            hm.put(val,hm.getOrDefault(val,0)+1);
            while(hm.size()>k){
                int lval=nums[l];
                hm.put(lval,hm.get(lval)-1);
                if(hm.get(lval)==0){
                    hm.remove(lval);
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int finalAns=atmost(nums,k)-atmost(nums,k-1);
        return finalAns;
    }
}