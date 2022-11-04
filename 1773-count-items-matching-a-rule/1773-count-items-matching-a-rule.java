class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("type", 0);
        map.put("color",1);
        map.put("name", 2);
        
        int key=map.get(ruleKey);
        int count=0;
        
        for(List<String> list: items){
            if(ruleValue.equals(list.get(key))){
                count++;
            }
        }
        return count;
    }
}