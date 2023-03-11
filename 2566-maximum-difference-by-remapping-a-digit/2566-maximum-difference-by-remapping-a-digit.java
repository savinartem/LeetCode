class Solution {
    public int minMaxDifference(int num) {
        char ch[] =String.valueOf(num).toCharArray();
        int index=-1;
        
        for(int i=0; i<ch.length;i++)
        {
            if(ch[i]!='9')
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            return num;
        }
        int max=Integer.parseInt(String.valueOf(num).replaceAll(""+ch[index],"9"));
        int min=Integer.parseInt(String.valueOf(num).replaceAll(""+ch[0],"0"));
        return max-min;
    }
}