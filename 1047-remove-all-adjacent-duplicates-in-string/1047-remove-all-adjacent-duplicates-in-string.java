class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack= new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(!stack.empty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        String str="";
        while(!stack.empty()){
            str=stack.pop()+str;
        }
        return str;
    }
}