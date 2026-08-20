class Solution {
    public String reverseStr(String s, int k) {
       char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k){
            int l=i;
            int r=Math.min(i+k-1,arr.length-1);
            while(l<r){
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        } 
        return new String(arr);
    }
}