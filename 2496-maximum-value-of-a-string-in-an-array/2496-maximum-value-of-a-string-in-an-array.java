class Solution {
    public int maximumValue(String[] strs) {
        int result=0;
        int temp=0;
        for(String s: strs){
            if(s.matches("\\d+")){ temp=Integer.parseInt(s); }
            else { temp=s.length(); }
            result=Math.max(result,temp);
        }
        return result;
    }
}

/*
"\d" is a digit (a character in the range [0-9]), and + means one or more times.
Thus, "\d+"" means match one or more digits.
*/