class Solution {
    public String reverseVowels(String s) {
     HashSet<Character> vowels= new HashSet<>();
        vowels.add('A');
        vowels.add('a');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('O');
        vowels.add('o');
        vowels.add('U');
        vowels.add('u');
        
        int left=0;
        int right=s.length()-1;
        
        char[] c= s.toCharArray();
        
        while(left<right){
            while(left<right && !vowels.contains(c[left])){
                left++;
            }
            while(left<right && !vowels.contains(c[right])){
                right--;
            }
            char temp=c[left];
            c[left++]=c[right];
            c[right--]=temp;
        }
        
        return new String(c);
    }
}