class Solution {
    public int countTime(String time) {
     int result=1;
        char[] t=time.toCharArray();
        if(t[4]=='?'){
            result*=10;
        }
        if(t[3]=='?'){
            result*=6;
        }
        if(t[0]=='?' && t[1]=='?'){
            result*=24;
        }else{
            if(t[1]=='?'){
                if(t[0]=='2'){
                    result*=4;
                }else{
                    result*=10;
                }
            }else if(t[0]=='?'){
                  if(t[1]>='4'){
                      result*=2;
                  } else{
                      result*=3;
                  }
            }
        }
        return result;
    }
}