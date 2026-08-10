class Solution {
    public String clearDigits(String s) {
       
       Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&& ch<='9'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
             sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}