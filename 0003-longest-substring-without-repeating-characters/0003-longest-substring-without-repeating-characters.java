class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st = 0;
        int e = 0;
        int maxl = 0;

        HashSet<Character> set = new HashSet<>();
        

        while(e < s.length()){
            if(!set.contains(s.charAt(e))){
                set.add(s.charAt(e));
                maxl = Math.max(maxl,e - st +1);
                e++;
            }else{
                set.remove(s.charAt(st));
                st++;
            }
        }

        return maxl;
    }
}