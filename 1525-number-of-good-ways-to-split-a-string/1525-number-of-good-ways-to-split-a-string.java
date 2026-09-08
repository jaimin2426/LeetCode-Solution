class Solution {
    public int numSplits(String s) {
        HashMap<Character, Integer> right = new HashMap<>();

        HashSet<Character> left = new HashSet<>();


        for(char ch : s.toCharArray()){
            right.put(ch,right.getOrDefault(ch,0)+1);
        }

        int ans = 0;
        for(int i=0;i<s.length()-1;i++){

            char ch = s.charAt(i);

            left.add(ch);

            right.put(ch,right.get(ch)-1);

            if(right.get(ch) == 0){
                right.remove(ch);
            }

            if(left.size() == right.size()) ans++;
        }

        return ans;
    }
}