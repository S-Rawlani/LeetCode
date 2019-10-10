class Solution {
    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0)
            return -1;
        Map<Character,Integer> counts = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(!counts.containsKey(s.charAt(i)))
            {
                counts.put(s.charAt(i), i);
            }
            else{
                counts.put(s.charAt(i),-1);
            }
        }
        int index = Integer.MAX_VALUE;
        for(char c: counts.keySet())
        {
            if(counts.get(c) > -1 && counts.get(c) < index)
                index = counts.get(c);
        }
        if(index == Integer.MAX_VALUE)
            return -1;
        return index;
        
    }
}