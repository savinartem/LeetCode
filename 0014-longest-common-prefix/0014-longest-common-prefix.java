class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String temp=strs[0];
        
        for(int i=1; i<strs.length;i++){
            for(int j=0;j<temp.length();j++){
                if(j==strs[i].length() || temp.charAt(j)!=strs[i].charAt(j)){
                    temp=temp.substring(0,j);
                    break;
                }
            }
        }
        return temp;
    }
}