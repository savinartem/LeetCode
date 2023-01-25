class Solution {
    public String smallestNumber(String pattern) {
        int[] result = new int[pattern.length()+1];
        int count=1;
        
        Stack<Integer> stk= new Stack<>();
        for(int i=0; i<=pattern.length();i++){
            if(i==pattern.length() || pattern.charAt(i)=='I'){
                result[i]=count++;
                while(!stk.isEmpty()){
                    result[stk.pop()]=count++;
                }
            }else { stk.push(i); }
        }
        String str="";
        for(int val: result){
            str+=val;
        }
        return str;
    }
}