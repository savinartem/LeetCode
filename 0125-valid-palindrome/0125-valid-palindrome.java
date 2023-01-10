class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){left++;}
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){ right--; }
            
            if(left< right && s.charAt(left)!=s.charAt(right)) { return false; }
            left++;
            right--;
        }
        return true;
    }
}

/*
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

*/