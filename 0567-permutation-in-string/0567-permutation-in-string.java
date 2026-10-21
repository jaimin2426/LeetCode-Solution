class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();

        if (k > s2.length()) {
            return false;
        }

        int org[] = new int[26];
        int win[] = new int[26];

        for (int i = 0; i < k; i++) {
            org[s1.charAt(i) - 'a']++;
            win[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(org, win)) {
            return true;
        }
        int l = 0;
        int r = k;
        while (r < s2.length()) {
            win[s2.charAt(l) - 'a']--;
            win[s2.charAt(r) - 'a']++;
            l++;
            r++;
            if (Arrays.equals(org, win)) {
                return true;
            }
        }
        return false;
    }
}