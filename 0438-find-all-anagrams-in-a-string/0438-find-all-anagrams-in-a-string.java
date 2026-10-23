class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int k = p.length();

        if (k > s.length()) {
            return ans;
        }

        int[] org = new int[26];
        int[] win = new int[26];

        for (int i = 0; i < k; i++) {
            org[p.charAt(i) - 'a']++;
            win[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(org, win)) {
            ans.add(0);
        }

        int left = 0;
        int right = k;

        while (right < s.length()) {
            win[s.charAt(left) - 'a']--;
            win[s.charAt(right) - 'a']++;

            left++;
            right++;

            if (Arrays.equals(org, win)) {
                ans.add(left);
            }
        }

        return ans;
    }
}
