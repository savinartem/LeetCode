class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> map= new HashMap<>();
        
        for(char ch: num.toCharArray()){ map.put(ch-'0', map.getOrDefault(ch-'0',0)+1); }
        
        for(int i=0; i<num.length();i++){
            if(map.containsKey(i)){
                int temp=map.get(i);
                if(num.charAt(i)-'0'!=temp){ return false; }
            }
            else if(num.charAt(i)-'0'!=0){ return false; }
        }
        return true;
    }
}