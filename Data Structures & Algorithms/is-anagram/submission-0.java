class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] srr = new int[26];
        int[] trr = new int[26];
        for(int i=0;i<s.length();i++) {
            srr[s.charAt(i) - 'a']++;
        }
        for(int i = 0;i<t.length();i++) {
            trr[t.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++) {
            if(srr[i]!=trr[i]) return false;
        }
        return true;
    }
}
