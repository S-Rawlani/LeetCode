class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        
        
        List<String> ans = new ArrayList<>();
        Set<String> shortWords = new HashSet<>();
        
        if(words.length == 0)
            return ans;
        
        Arrays.sort(words, new Comparator<String>()
                    {
                        @Override
                        public int compare(String s1, String s2)
                        {
                            return s1.length() - s2.length();
                        }
                        
                    });
        for(String s : words)
        {
            if(wordExist(s, shortWords))
            {
                ans.add(s);
            }
            shortWords.add(s);
        }
        return ans;
        
    }
    public boolean wordExist(String s, Set<String> shortWords)
    {
        if(shortWords.isEmpty())
            return false;
        boolean dp[] = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 1; i <= s.length(); i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(dp[j] && shortWords.contains(s.substring(j, i)))
                {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}