class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chArray= new char[indices.length];
        for(int i=0; i<indices.length;i++){
            chArray[indices[i]]=s.charAt(i);
        }
        return new String(chArray);
    }
}