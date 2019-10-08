class Solution {
        public final String[] oneDigit = new String[]{"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        public final String[] twoDigit = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        public final String[] tensDigit = new String[]{"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public String numberToWords(int num) {
        
        String ans = new String();
        
        if(num == 0)
            return "Zero";
        else
        {
            ans = helper(num);
        }
        return ans;
        
    }
    public String helper(int num)
    {
        String result = new String();
        if(num < 10)
            result = oneDigit[num];
        else if(num < 20)
            result = twoDigit[num-10];
        else if(num < 100)
            result = tensDigit[num/10] + " " + oneDigit[num % 10];
        else if(num < 1000)
            result = helper(num/100) + " Hundred " + helper(num % 100);
        else if(num < 1000000)
            result = helper(num / 1000) + " Thousand " + helper(num % 1000);
        else if (num < 1000000000)
            result = helper(num / 1000000) + " Million " + helper(num % 1000000);
        else
            result = helper(num / 1000000000) + " Billion " + helper(num % 1000000000);
         return result.trim();
    }
}