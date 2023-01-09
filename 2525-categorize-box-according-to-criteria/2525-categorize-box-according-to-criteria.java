class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky=false;
        boolean heavy=false;
        
        long volume=((long)length*(long)width*(long)height);
        
        if(volume>=1000000000 ||
           length>=10000 ||
            width>=10000 ||
            height>=10000)
        { bulky=true; }
        
        if(mass>=100){ heavy=true; }
        
        if(!bulky && !heavy) { return "Neither"; }
        else if(!bulky && heavy) { return "Heavy"; }
        else if(bulky && !heavy){ return "Bulky"; }
        else { return "Both"; }
    }
}