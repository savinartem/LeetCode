class Solution {
    public int convertTime(String current, String correct) {
        int count=0;
        String[] arrCurrent= current.split(":");
        String[] arrCorrect= correct.split(":");
        
        int hourCurrent=Integer.parseInt(arrCurrent[0]);
        int minCurrent=Integer.parseInt(arrCurrent[1]);
        
        int hourCorrect=Integer.parseInt(arrCorrect[0]);
        int minCorrect= Integer.parseInt(arrCorrect[1]);
        
        int totMinCurr=hourCurrent*60+minCurrent;
        int totMinCorr=hourCorrect*60+minCorrect;
        
        int diff=totMinCorr-totMinCurr;
        
        while(diff>0)
        {
            if(diff>=60)
            {
                diff-=60;
            }
            else if( diff>=15)
            {
                diff-=15;
            }
            else if(diff>=5)
            {
                diff-=5;
            }
            else
            {
                diff-=1;
            }
            count++;
        }
        return count;
    }
}