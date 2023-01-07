class Solution {
    public boolean equalFrequency(String word) {
        
        Map<Character, Integer> map= new HashMap<>();
        
        for(int i=0; i<word.length();i++){
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i),0)+1);
        }
        
        for(int i=0; i<word.length();i++){
            char ch=word.charAt(i);
            if(map.get(ch)==1){ map.remove(ch); }
            else {
                map.put(ch, map.get(ch)-1);
            }
            
            Set<Integer> set = new HashSet<>(map.values());
            if(set.size()==1) { return true; }
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return false;
    }
}