class Solution {
    public int rearrangeCharacters(String s, String target) {
        int result=Integer.MAX_VALUE;
        Map<Character, Integer> map1=new HashMap<>();
        Map<Character, Integer> map2= new HashMap<>();
        
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        
        int temp=0;
        
        for(int i=0; i<target.length();i++){
            char t=target.charAt(i);
            map2.put(t, map2.getOrDefault(t,0)+1);
        }
        
        for(char c: target.toCharArray()){
            result=Math.min(result, (map1.getOrDefault(c,0)/map2.get(c)));
        }
        return result;
    }
}