class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set<String> wordSet = new HashSet<>(wordList);
        if(!wordSet.contains(endWord))
            return 0;
        
        //bfs
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int count = 0;
        while(!queue.isEmpty())
        {
            int len = queue.size();
            for(int i = 0; i < len; i++)
            {
                String currentWord = queue.poll();
                if(currentWord.equals(endWord))
                    return count+1;
                for(int j = 0; j < currentWord.length(); j++)
                {
                    char[] wordChar = currentWord.toCharArray();
                    for(char c = 'a'; c <= 'z'; c++)
                    {
                        wordChar[j] = c;
                        String curr = new String(wordChar);
                        if(wordSet.contains(curr) && !currentWord.equals(curr))
                        {
                            queue.add(curr);
                            wordSet.remove(curr);
                        }
                    }
                }
            }
            count++;  
        }
        return 0;
        
    }
}