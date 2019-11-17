class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int len = nums.length;
        int result[] = new int[len];
        Arrays.fill(result, 1);

        for(int i = 1 ; i < len; i++)
        {
            result[i] = result[i-1]*nums[i-1];   
        }
        int prod = 1;
        for(int i = len-1; i >= 0; i--)
        {
            if(i < (len-1))
                result[i] *= prod;
            prod *= nums[i];
        }
        return result;
    }
}