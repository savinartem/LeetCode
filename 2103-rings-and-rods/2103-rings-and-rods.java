class Solution {
    public int countPoints(String rings) {
        HashMap<Character,String> store = new HashMap<>();
        for(int i=1; i<rings.length(); i+=2){
            store.put(rings.charAt(i), store.getOrDefault(rings.charAt(i),"")+rings.charAt(i-1));
			// key is rod number and value is the color of rings. 
			//"B0R0G0" will be stored as {0=BRG}
        }
        int count=0;
        for(Map.Entry<Character,String> s : store.entrySet()){
            if(s.getValue().contains("B") && s.getValue().contains("G") && s.getValue().contains("R")) count++;
			// checking if rod contains all the 3 color rings
        }
        return count;
    }
}
    //rings = "B0B6G0R6R0R6G9"