class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
                mp.put(nums2[i], i);
            }
        for(int i = 0; i < nums1.length; i++)
        {
            int index = mp.get(nums1[i]);
            if(index == nums2.length-1){
                ans[i] = -1;
            }
            for(int j = index; j < nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    ans[i] = nums2[j];
                    break;
                }
                else
                    ans[i] = -1;
            }    
        }
        return ans;
}
}