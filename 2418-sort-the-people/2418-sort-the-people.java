class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map= new HashMap<>();
        for(int i=0; i<heights.length; i++){
            map.put(heights[i], names[i]);
        }
        
        Arrays.sort(heights);
        StringBuilder sb =new StringBuilder();
        String[] results=new String[heights.length];
        int j=0;
        for(int i=heights.length-1; i>=0;i--){
            results[j]=map.get(heights[i]);
            j++;
        }
        return results;
    }
}