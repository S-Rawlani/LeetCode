class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] ans = new int[r][c];
        int pos= 0 ;
        int m = nums.length;
        int n = nums[0].length;
        if(n == 0 && m == 0)
            return new int[][]{};
            
        if(m*n != r*c){
            return nums;
        }
        else{
           for(int i = 0; i < r; i++){
               for(int j = 0; j < c; j++){
                   pos = i*c + j; 
                   ans[i][j] = nums[pos/n][pos%n];
               }
           } 
        }
        return ans;
    }
}