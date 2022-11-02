class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map=  new HashMap<Character, Character>();
        
        
        String abc="abcdefghijklmnopqrstuvwxyz";
        int j=0;
        
        for(int i=0; i<key.length();i++){
            if(key.charAt(i)==' '){
                continue;
            }
            if(!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i), abc.charAt(j++));
            }
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                sb.append(' ');
            }else{
                sb.append(map.get(message.charAt(i)));
            }
        }
        return sb.toString();
    }
}