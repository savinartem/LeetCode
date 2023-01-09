class Solution {
    public boolean isCircularSentence(String sentence) {
       int len=sentence.length();
        if(len==1){ return true; }
        char firstCh=sentence.charAt(0);
        
        if(firstCh!=sentence.charAt(len-1)){ return false; }
        
        char beforeSpace=firstCh;
        char prevCh=firstCh;
        
        for(int i=0; i<len;i++){
            char ch=sentence.charAt(i);
            if(ch==' '){
                beforeSpace=prevCh;
            }else if( prevCh==' ' && beforeSpace!=ch){ return false; }
            
            prevCh=ch;
        }
        return true;
    }
}