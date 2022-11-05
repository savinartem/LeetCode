class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set=new HashSet<>();
        char[] ch=sentence.toCharArray();
        for(int i=0; i<ch.length;i++){
            set.add(ch[i]);
            if(set.size()==26){
                return true;
            }
        }
        return false;
    }
}