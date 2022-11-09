class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> repeated=new ArrayList<>();
        HashMap<String, Integer> map= new HashMap<>();
        int count=0;
        while(count+10<=s.length()){
            String sub=s.substring(count,count++ +10);
            map.put(sub, map.getOrDefault(sub,0)+1);
            if(map.get(sub)==2){
                repeated.add(sub);
            }
        }
        return repeated;
    }
}