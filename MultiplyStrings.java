class Solution {
    public String multiply(String num1, String num2) {
        char[] number1 = num1.toCharArray();
        char[] number2 = num2.toCharArray();
        int[] ans = new int[number1.length + number2.length];
        int n = 0;
        int carry = 0;
        int index = ans.length - 1;
        int count = 0;
        for(int i = number2.length - 1 ; i >= 0; i--){
            index = ans.length - count - 1;
            count++;
            for(int j = number1.length - 1; j>= 0; j --){
                n = carry + ans[index] + (number2[i] - '0') * (number1[j] - '0');
                if(n > 9){
                    ans[index--] = n % 10;
                    carry = n / 10;
                }
                else{
                    ans[index--] = n;
                    carry = 0;
                }
                if(j == 0){
                    ans[index--] += carry;
                    carry = 0;
                }
            }
        }
        int j = 0;
        while(ans[j] == 0 && j < ans.length-1){ 
            j++;
        }
        String s = "";
        for(int i = j; i < ans.length; i++){
            s += Integer.toString(ans[i]);
        }
        if(s.length() != 0){
            return s;
        }
        return "0";
    }
}