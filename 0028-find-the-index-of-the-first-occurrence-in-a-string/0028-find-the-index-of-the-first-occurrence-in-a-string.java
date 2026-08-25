class Solution {
    public int strStr(String h, String n) {
        for(int i=0, j = n.length();j<=h.length();i++,j++){
            if(h.substring(i,j).equals(n)){
                return i;
            }
        }
        return -1;
    }
}