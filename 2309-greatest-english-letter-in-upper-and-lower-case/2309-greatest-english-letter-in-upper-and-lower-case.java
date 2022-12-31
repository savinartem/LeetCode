class Solution {
    public String greatestLetter(String s) {
        int arr1[]= new int[26];
        int arr2[]= new int[26];
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)<96){
             arr1[s.charAt(i)-'A']=1;   
            }else{
                arr2[s.charAt(i)-'a']=1;
            }
        }
        int max=0;
        String result="";
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr2[i] && arr1[i]!=0){
                if(i>=max){
                    max=i;
                    result=String.valueOf((char)('A'+i));
                }
            }
        }
        return result;
    }
}

/*
Low case from 65 to 90
Upper case from 97 to 122

*/