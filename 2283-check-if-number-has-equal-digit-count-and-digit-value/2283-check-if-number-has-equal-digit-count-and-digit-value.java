class Solution {
    public boolean digitCount(String num) {
        int[] temp = new int[10];
        for(char c:num.toCharArray()){
            temp[c-'0']++;
        }
        for(int i=0;i<num.length();i++){
            int digit=num.charAt(i)-'0';
            if(digit!=temp[i]){
                return false;
            }
        }
        
        return true;
    }
}