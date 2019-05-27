class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int size = nums.length;
        int ans[] = new int[size];
        Stack<Integer> st = new Stack<>();
        for(int i = size - 1; i >= 0; i--){
            st.push(i);
        }
        for(int i = size - 1; i >= 0; i--){
            ans[i] = -1;
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = nums[st.peek()];
            }
            st.push(i);
        }
        return ans;
    }
}