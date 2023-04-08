class Solution {
    public boolean makeEqual(String[] words) {
        int n=words.length;
        
        HashMap<Character, Integer> hm= new HashMap<>();
        
        for(String word: words)
        {
            for(char c: word.toCharArray())
            {
                hm.put(c,hm.getOrDefault(c,0)+1);
            }
        }
        for(char key: hm.keySet())
        {
            if(hm.get(key)%n!=0)
            {
                return false;
            }
        }
        return true;
    }
}