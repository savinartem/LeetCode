class Solution {
    public int largestInteger(int num) {
     int temp=num;
        int result=0;
        
        List<Integer> evens= new ArrayList<>();
        List<Integer> odds=new ArrayList<>();
        while(temp>0){
            int rem=temp%10;
            if(rem%2==0){ evens.add(rem); }
            else { odds.add(rem); }
            temp/=10;
        }
        
        Collections.sort(evens);
        Collections.sort(odds);
        
        temp=num;
        int e=0;
        int o=0;
        int a=1;
    
        while(temp>0){
            int rem=temp%10;
            if(rem%2==0)
            { result+=a*evens.get(e++); }
            else{ result+=a*odds.get(o++);  }
            
            temp/=10;
            a*=10;
        }
        return result;
    }
}