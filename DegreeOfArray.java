class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();
        int degree = Integer.MAX_VALUE;
        int max_freq = 0;
        for(int i = 0; i < nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i], 1);
                mp1.put(nums[i], i);
                if(max_freq == 0)
                    max_freq = 1;
            }
            else{
                mp.put(nums[i], mp.get(nums[i])+1);
                mp2.put(nums[i], i);
                if(mp.get(nums[i]) > max_freq){
                    max_freq = mp.get(nums[i]);
                }
            }
        }
        if(max_freq == 1){
            degree = 1;
        }
        else{
            for(Map.Entry<Integer,Integer> itr : mp.entrySet()){
                if(itr.getValue() == max_freq){
                    if((mp2.get(itr.getKey()) - mp1.get(itr.getKey())) < degree){
                        degree = mp2.get(itr.getKey()) - mp1.get(itr.getKey()) + 1;
                    }
                }
            }
        }
        
       return degree; 
    }
}