class Solution {

    boolean isPalindrom(String str){
        int left =0, right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    String conversion(int n, int i){
        StringBuilder sb  = new StringBuilder();
        while(n!=0){
            int rem = n%i;
            n/=i;
            sb.insert(0,rem);
        }
        return sb.toString();
    }
    public boolean isStrictlyPalindromic(int n) {
        
        for(int i=2; i<=n-2; i++){
            String st = conversion(n,i);
            if(isPalindrom(st)){
                continue;
            }
            else{
                return false;
            }
          
        }

        return true;
    }
}
