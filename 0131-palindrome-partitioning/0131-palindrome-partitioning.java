class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        back(0, s, temp, ans);

        return ans;
    }

    public void back(int start, String s, List<String> temp, List<List<String>> ans) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (ispali(s, start, i)) {
                temp.add(s.substring(start, i + 1));
                back(i + 1, s, temp, ans);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public boolean ispali(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;

        }
        return true;
    }
}
