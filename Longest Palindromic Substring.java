class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0 || s == null)
            return "";
       String maxLengthString = s.substring(0,1);
       for(int i = 0; i < s.length(); i++)
       {
           String temp = helper(s, i, i);
           if(temp.length() > maxLengthString.length())
               maxLengthString = temp;
           temp = helper(s, i, i+1);   //for even length string
           if(temp.length() > maxLengthString.length())
               maxLengthString = temp;
       }
        return maxLengthString;
    }
    public String helper(String s, int start, int end)
    {
        while(start >= 0 && end <= s.length()-1 && s.charAt(start) == s.charAt(end))
        {
            start--;
            end++;
        }
        return s.substring(start+1, end);
    }
}