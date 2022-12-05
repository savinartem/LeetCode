class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Character, Integer> map= new HashMap<>();
        for(char suit : suits){
            if(map.containsKey(suit)){
                map.put(suit, map.get(suit)+1);
                if(map.get(suit)==5){
                    return "Flush";
                }
            }else{
                map.put(suit,1);
            }
        }
        String s="";
        HashMap<Integer, Integer> map2= new HashMap<>();
        for(int rank: ranks){
            if(map2.containsKey(rank)){
                map2.put(rank, map2.get(rank)+1);
                if(map2.get(rank)==2){
                    s="Pair";
                }else if(map2.get(rank)==3){
                    s="Three of a Kind";
                    return s;
                }
            } else {
                map2.put(rank, 1);
            }
        }
        if(s.isEmpty()){ return "High Card"; }
        else{ return s; }
    }
}