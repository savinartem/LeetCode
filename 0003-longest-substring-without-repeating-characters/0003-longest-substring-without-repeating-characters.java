class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
        * Sliding window problem using 2 pointers
        */
       int firstPt=0;
       int secondPt=0;
       int max=0;

       HashSet<Character> set= new HashSet<>();

       while(secondPt<s.length()){
           if(!set.contains(s.charAt(secondPt))){
               set.add(s.charAt(secondPt));
               secondPt++;
               max=Math.max(set.size(), max);
           }else{
               set.remove(s.charAt(firstPt));
               firstPt++;
           }
       } 
       return max;
    }
}