class Solution {
    public boolean checkDistances(String s, int[] distance) {
        char[] arr= s.toCharArray();
        
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    int dis=j-i-1;
                    char ch=arr[i];
                    if(distance[ch-'a']!=dis){
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}