class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left; i<=right;i++)
        {
            char b=words[i].charAt(0);
            char e=words[i].charAt(words[i].length()-1);
            if((b=='a' ||b=='e' || b=='o' || b=='u' || b=='i') &&
              (e=='a' || e=='e' || e=='o' || e=='u' || e=='i'))
            {
                count++;
            }
        }
        return count;
    }
}