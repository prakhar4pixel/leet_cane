class Solution {
    static String longestPalindrome(String s) {
        int f = s.length();
        String longest = "";
        for (int i = 0; i < f; i++) {
            for (int j = i ; j < f; j++) {
                if (ispalindrome(s, i, j) && (j - i + 1) > longest.length()) {
                    longest = s.substring(i, j + 1);
                }
            }
        }
        return longest;
    }

    static boolean ispalindrome(String s, int a, int b) {
        while (a < b) {
            if (s.charAt(a) != s.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}