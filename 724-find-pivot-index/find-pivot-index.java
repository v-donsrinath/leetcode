class Solution {
    public int pivotIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int lsum=0;
            for(int j=0;j<i;j++){
                lsum+=nums[j];
            }
            int rsum=0;
            for(int k=i+1;k<nums.length;k++){
                rsum+=nums[k];;    
            }
            if(lsum==rsum){
                return i;
            }
        }
        return -1;
    }   
}