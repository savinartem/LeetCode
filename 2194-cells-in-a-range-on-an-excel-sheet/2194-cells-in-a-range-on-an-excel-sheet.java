class Solution {
    public List<String> cellsInRange(String s) {
        List<String> result= new ArrayList<>();
        char startCol=s.charAt(0);
        char endCol=s.charAt(3);
        char startRow=s.charAt(1);
        char endRow=s.charAt(4);

        for(char c=startCol; c<=endCol;c++){
            for(char r=startRow; r<=endRow; r++){
                result.add(""+c+r);
            }
        }
        return result;
    }
}