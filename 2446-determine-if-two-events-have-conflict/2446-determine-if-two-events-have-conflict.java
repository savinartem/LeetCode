class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int a=event2[1].compareTo(event1[0]);
        int b=event2[0].compareTo(event1[1]);
        return (a>=0) && (b<=0);
    }
}