class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        if(l<2) return l;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int left = 0;
        int right = 0;
        int res = 0;
        int curr = 0;
        while(right<l) {
            Character c = s.charAt(right);
            if(map.containsKey(c)) {
                int index = map.get(c);
                while(left<=index) {
                    map.remove(s.charAt(left));
                    left++;
                }
                map.put(c, right);
                curr = right - left + 1;
                right++;
            } else {
                map.put(c, right);
                curr++;
                res = Math.max(res, curr);
                right++;
            }
        }
        return res;
    }
}
