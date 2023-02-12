class Solution {
    public int percentageLetter(String s, char letter) {
        int n=s.length();
        double count=0;
        
        for(int i=0; i<n;i++)
        {
            if(s.charAt(i)==letter)
            {
                count++;
            }
        }
        return (int)((count/n)*100);
    }
}