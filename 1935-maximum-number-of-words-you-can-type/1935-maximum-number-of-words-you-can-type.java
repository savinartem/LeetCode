class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int result=0;
        
        Set<Character> set= new HashSet<>();
        for(char c: brokenLetters.toCharArray())
        {
            set.add(c);
        }
        
        String[] arr=text.split(" ");
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length(); j++)
            {
                if(set.contains(arr[i].charAt(j)))
                {
                    result--;
                    break;
                }
            }
            result++;
        }
        return result;
    }
}