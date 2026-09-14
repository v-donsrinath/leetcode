class Solution {
    public int calculate(String s) {
        List<Integer> nums=new ArrayList<>();
        List<Character> ops=new ArrayList<>();
        

        int num=0;
        for(char ch:s.toCharArray()){
            if(ch==' ') continue;

            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else{
                nums.add(num);
                ops.add(ch);
                num=0;
            }
        }
        nums.add(num);  //  for last number in the string becaz above for loop runs upto the last operator so for last nnumber we are adding it

        for(int i=0;i<ops.size(); ){
            if(ops.get(i)=='*' || ops.get(i)=='/'){
               int a=nums.get(i);
               int b=nums.get(i+1);
               int val=(ops.get(i)=='*') ? a*b : a/b;

               nums.set(i,val);
               nums.remove(i+1);
               ops.remove(i);
            }
            else{
                i++;
            }

        } 
        int result=nums.get(0);
        for(int i=0;i<ops.size();i++){
            if(ops.get(i)=='+'){
                result+=nums.get(i+1);
            }
            else{
                result-=nums.get(i+1);
            }
        }
        return result;
    }
}