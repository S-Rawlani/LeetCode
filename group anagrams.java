class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> groupedAnagrams = new ArrayList<>();
        if(strs.length == 0 || strs == null)
            return null;
        Map<String, List<String>> similar = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            if(!similar.containsKey(str))
                similar.put(str, new ArrayList<String>());
        
            similar.get(str).add(s);
            }

        groupedAnagrams.addAll(similar.values());
        return groupedAnagrams;
    }
}