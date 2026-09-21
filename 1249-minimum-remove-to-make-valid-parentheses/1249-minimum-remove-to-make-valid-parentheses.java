class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();

        int bala = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                bala++;
                sb.append(ch);
            }else if(ch == ')'){
                if(bala > 0){
                    bala--;
                    sb.append(ch);
                }
            }else{
                sb.append(ch);
            }
        }

        StringBuilder r = new StringBuilder();

        bala = 0;

        for(int i = sb.length() - 1; i >= 0; i--){
            char ch = sb.charAt(i);
            if(ch == ')'){
                bala++;
                r.append(ch);
            }else if(ch == '('){
                if(bala > 0){
                    bala--;
                    r.append(ch);
                }
            }else{
                r.append(ch);
            }
        }

        return r.reverse().toString();

    }
}