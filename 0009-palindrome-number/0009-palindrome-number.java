class Solution {
    public boolean isPalindrome(int x) {
    boolean isfalse =true;
    String s = String.valueOf(x);
    int n = s.length();
    
    
    for(int i=0;i<n/2;i++){
     if(s.charAt(i)!=s.charAt(n-i-1)){
        isfalse= false;
     }
    } 
       return isfalse;
    }
}