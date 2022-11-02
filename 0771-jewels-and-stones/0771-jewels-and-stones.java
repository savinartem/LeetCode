class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result=0;
        HashMap<Character, Character> map= new HashMap<>();
        char[] jArr= jewels.toCharArray();
        for(int i=0;i<jArr.length;i++){
            map.put(jArr[i],jArr[i]);
        }
        char[] sArr=stones.toCharArray();
        for(int i=0; i<sArr.length;i++){
            if(map.containsKey(sArr[i])){
                result++;
            }
        }
        return result;
    }
}