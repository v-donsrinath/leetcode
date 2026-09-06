class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        long l=1;
        long r=x/2;

        while(l<=r){
            long mid=l+(r-l)/2;
            long square=mid*mid;
             
            if(square==x){
                return (int) mid;
            }
            if(square<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }

        }
        return (int) r;
    }
}