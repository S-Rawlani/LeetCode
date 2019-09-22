class Solution {
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        Map<String, Integer> hm1 = new HashMap<>();
        Set<String> hm2 = new HashSet<>();
        int max = Integer.MIN_VALUE;
        StringBuilder result = new StringBuilder();
        String paragraph1 = paragraph.toLowerCase();
        String str[] = paragraph1.split("\\W+");
        
        for(int i = 0; i < banned.length; i++)
        {
            hm2.add(banned[i]);
        }
        for(int i = 0; i < str.length; i++)
        {
            if(!hm1.containsKey(str[i]))
            {
                if(!hm2.contains(str[i])){
                    hm1.put(str[i], 1);
                }     
            }
            else
            {
                hm1.put(str[i], hm1.get(str[i])+1);
            }
        }
        for (Map.Entry<String, Integer> entry : hm1.entrySet())
        {
            if(entry.getValue() > max)
            {
                max = entry.getValue();
                result = new StringBuilder(entry.getKey());
            }
        }
        return result.toString();
        
    }
}