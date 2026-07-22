class Solution {
    public int lengthOfLastWord(String s) {
         String s2 = s.stripTrailing();
         int count=0;
        int i=s2.length()-1;
        if(i==0){
            return 1;
        }
        if(s2.contains(" ")){
        while(s2.charAt(i) != ' '){
            count++;
            i--;
        }}
        else{return s2.length();}
        return count;
    }
}