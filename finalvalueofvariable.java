class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x =0;
       for(var s : operations){
           x += (s.charAt(1) == '+'? 1: -1);
       }
        return x;
    }
}
