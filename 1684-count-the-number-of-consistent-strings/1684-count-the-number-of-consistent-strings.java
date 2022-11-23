class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character, Integer>  mp = new HashMap<>();
        int count=words.length;
        for(int i=0; i<allowed.length();i++){
            mp.put(allowed.charAt(i),1);
        }
        for(int i=0; i<words.length;i++){
            for(int j=0; j<words[i].length();j++){
                if(mp.get(words[i].charAt(j))==null){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}