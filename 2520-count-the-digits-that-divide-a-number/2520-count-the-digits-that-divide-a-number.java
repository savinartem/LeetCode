class Solution {
    public int countDigits(int num) {
        int count=0;
        int temp=num;
        while(num!=0){
            int rem=num%10;
            num/=10;
            if(temp%rem==0){ count++; }
        }
        return count;
    }
}