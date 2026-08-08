class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";

        char bits[] = "0123456789abcdef".toCharArray();
        StringBuilder r = new StringBuilder();

        while(num != 0){
            int dig = num & 15;
            r.append(bits[dig]);
            num = num >>> 4;
        }

        return r.reverse().toString();
    }
}