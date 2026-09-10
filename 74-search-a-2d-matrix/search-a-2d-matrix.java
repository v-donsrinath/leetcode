class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=n*m-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int a=mid/m;
            int b=mid%m;
            if(matrix[a][b]==target){
                return true;
            }else if(matrix[a][b]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return false;     
    }
}