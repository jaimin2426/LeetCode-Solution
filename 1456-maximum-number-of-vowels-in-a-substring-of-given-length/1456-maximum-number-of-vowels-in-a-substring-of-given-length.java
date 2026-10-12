class Solution {
    public int maxVowels(String s, int k) {
        int l = 0;
        int r = k;
        int c = 0;

        for(int i=0;i<k;i++){
            char ch = s.charAt(i);

            if(isvowel(ch)){
                c++;
            }
        }
        int ans = c;
        while(r < s.length()){
            if(isvowel(s.charAt(l))){
                c--;
            }
            if(isvowel(s.charAt(r))){
                c++;
            }

            ans = Math.max(ans,c);

            l++;

            r++;
        }
        return ans;
    }

    private boolean isvowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}