class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb= new StringBuilder();
        Stack<Character> stack= new Stack<>();
        
        for(int i=0; i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){ 
                if(!stack.isEmpty()) { sb.append(c); }
                stack.push(c);
            }else {
                stack.pop();
                if(!stack.isEmpty()) { sb.append(c); }
            }
        }
        return sb.toString();
    }
}