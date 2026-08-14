class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // int l=0;
        // int temp=0;
        // int ans=Integer.MIN_VALUE;
        
        // for(int r=0;r<nums.length;r++){
        //     temp+=nums[r];
        //     if(r-l+1==k){   
        //         ans=Math.max(ans,temp);
        //         temp-=nums[l];
        //         l++;
                   
        //     }   
        // } 
        
        // return (double) ans/k;

        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        return (double) maxsum/k;
    }
}