class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int ans=0;
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int r=0;r<fruits.length;r++){
            int val=fruits[r];
            hm.put(val,hm.getOrDefault(val,0)+1);
            while(hm.size()>2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                }
                l++;
            }
           
            ans=Math.max(r-l+1,ans);
        }
        return ans;
    }
}
