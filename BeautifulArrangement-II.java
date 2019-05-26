class Solution {
    public int[] constructArray(int n, int k) {
        int start = 1;
        int end = n;
        int ans[] = new int[n];
        for(int i = 0; start <= end; i++){
            if(k > 1){
                if(k % 2 != 0){
                    ans[i] = start;
                    start++;
                    k--;
                }
                else{
                    ans[i] = end;
                    end--;
                    k--;
                }
            }
            else{
                ans[i] = start;
                start++;
            }
        }
        return ans;
    }
}