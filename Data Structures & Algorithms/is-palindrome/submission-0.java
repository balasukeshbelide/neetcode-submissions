class Solution {
    public boolean isPalindrome(String s) {
        String result = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int len = result.length();
        int i = 0;
        int j = len - 1;
        while(i<=j){
            if (result.charAt(i) != result.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
