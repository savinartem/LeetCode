class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     //using binary search method

        int low=0; 
        int higth=letters.length-1;
        while(low<=higth){
            int mid=low+(higth-low)/2;
            if(letters[mid]<=target)
            {
                low++;
            }else{
                higth--;
            }
            
        }
        if(low==letters.length){
            return letters[0];
        }
        return letters[low];
    }
}