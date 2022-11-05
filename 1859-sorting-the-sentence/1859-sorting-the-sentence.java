class Solution {
    public String sortSentence(String s) {
        HashMap<Integer, String> map= new HashMap<>();
        String[] arr= s.split(" ");
        
        for(int i=0; i<arr.length; i++){
            int index=Character.getNumericValue(arr[i].charAt(arr[i].length()-1));
            map.put(index, arr[i].substring(0,arr[i].length()-1));
        }
        StringBuilder sb= new StringBuilder();
        for(Map.Entry<Integer, String> e: map.entrySet()){
            sb.append(e.getValue());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}