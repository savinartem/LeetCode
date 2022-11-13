class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map= new HashMap<>();
        for(List<String> p: paths){
            map.put(p.get(0), p.get(1));
        }
        String result=paths.get(0).get(0);
        while(map.containsKey(result)){
            result=map.get(result);
        }
        return result;
        
    }
}