class Solution {
    public int[] countBits(int num) {
        int ans[] = new int[num+1];
        for(int i = 1; i <= num; i++){
            ans[i] = ans[i/2];
            if(i % 2 == 1){
                ans[i]++;
            }
        }
        return ans;
    }
}