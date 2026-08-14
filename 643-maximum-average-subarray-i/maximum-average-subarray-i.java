class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // int l=0;
        // int temp=0;
        // int ans=0;
        // int avg=0;
        // for(int r=0;r<nums.length;r++){
        //     while(r-l+1==k){
        //         temp+=nums[r];
        //         ans=Math.max(ans,temp);
        //         temp-=arr[l];
        //         l++;
                   
        //     }   
        // } 
        // avg=ans/k;
        // return avg;

        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i];
            sum=sum-nums[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        return (double) maxsum/k;
    }
}