class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int r = 0;
        int a = x;
        while(a>0){
            r = r*10 + a%10;
            a/=10;
        }
        if(r ==x){
            return true;
        }
        return false;
    }
}