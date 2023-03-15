class Solution {
    public String reversePrefix(String word, char ch) {
        int start=0;
        char[] chArr=word.toCharArray();
        
        for(int i=0; i<chArr.length; i++)
        {
            if(chArr[i]==ch)
            {
                while(start<i)
                {
                    char a=chArr[start];
                    chArr[start]=chArr[i];
                    chArr[i]=a;
                    start++;
                    i--;
                }
                break;
            }
        }
        return new String(chArr);
    }
}