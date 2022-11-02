class Solution {
    public boolean isHappy(int n) {

        int sum=0;
        HashSet<Integer> set= new HashSet<>();
       
        while (n!=1){
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);
            }
            sum=0;
            while(n!=0){
                
                sum=sum+(n%10)*(n%10);
                n=n/10;
            }
            n=sum;
          
        }
        return true;
    }
}