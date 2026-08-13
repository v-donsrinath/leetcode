class Solution {
    public String simplifyPath(String path) {
       Deque<String> deque=new ArrayDeque<>();

        String[] parts=path.split("/");
        for(String part:parts){
            if(part.equals("")||part.equals(".")){
                continue;
            }
            else if(part.equals("..")){
                if(!deque.isEmpty()){
                    deque.removeLast();
                }
            }
            else{
               deque.addLast(part);
            }
        }
        if(deque.isEmpty()){
            return "/";
        }
        StringBuilder result=new StringBuilder();
        for(String dir:deque){
            result.append("/").append(dir);
        }
        return result.toString();
    }
}