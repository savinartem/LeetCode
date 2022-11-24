class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map= new HashMap<Character, Integer>();
        int len=s.length();
        
        for(int i=0; i<len; i++){
            char c= s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int size= map.size();
        if(len%size!=0){
            return false;
        }
        int times=len/size;
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            int count=entry.getValue();
            if(count!=times){
                return false;
            }
        }
        return true;
    }
}