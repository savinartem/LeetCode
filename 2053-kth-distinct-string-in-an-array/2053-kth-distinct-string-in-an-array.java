class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        Map<String, Integer> map= new HashMap<>();
        
        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            if(map.get(arr[i])==1 && ++count==k)
            {
                return arr[i];
            }
        }
        return "";
    }
}