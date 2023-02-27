class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str=s.split(" ");
        int pre=-1;
        int cur=0;
        
        for(int i=0; i<str.length; i++)
        {
            char c=str[i].charAt(0);
            if(Character.isDigit(c))
            {
                cur=Integer.valueOf(str[i]);
                if(cur<=pre)
                {
                    return false;
                }
            }
            pre=cur;
        }
        return true;
    }
}