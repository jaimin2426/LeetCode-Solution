class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length() -1;
        int j=num2.length() -1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();
        
        while(i >= 0 || j >= 0 ||carry != 0){
            int dig1 = 0;
            int dig2 = 0;
            if(i >= 0){
                dig1 = num1.charAt(i) - '0';
                i--;
            }if(j >= 0){
                dig2 = num2.charAt(j) - '0';
                j--;
            }
            int sum = dig1+dig2+carry;

            int dig = sum % 10;
            carry = sum / 10;
            sb.append(dig);
        }

        return sb.reverse().toString();
    }
}