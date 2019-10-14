class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> li = new ArrayList<>();
        int[] lastOccurrence = new int[26];
        for(int i = 0 ; i < S.length(); i++)
        {
            lastOccurrence[S.charAt(i) - 'a'] = i;
        }
        int i = 0;
        while(i < S.length())
        {
            int last = lastOccurrence[S.charAt(i) - 'a'];
            int j = i;
            while(j < last)
            {
                last = Math.max(last, lastOccurrence[S.charAt(j) - 'a']);
                j++;
            }
            li.add(j-i+1);
            i = j+1;
        }
        return li;
    }
}