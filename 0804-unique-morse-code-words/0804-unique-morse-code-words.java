class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> set= new HashSet<>();
        for(String s:words){
            StringBuilder current= new StringBuilder();
            for(char ch: s.toCharArray()){
                current.append(morse[ch-'a']);
            }
            set.add(current.toString());
        }
        return set.size();
    }
}