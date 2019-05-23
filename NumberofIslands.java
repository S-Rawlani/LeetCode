class Solution {
    int count = 0;
    public int numIslands(char[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    helper(grid, i, j);
                    count++;
                }
                    
            }
        }     
        return count;
    }
    public void helper(char[][] grid, int a, int b){
        if(a < 0 || b < 0 || a >= grid.length || b >= grid[0].length || grid[a][b] == '0')
            return ;
        //mark it as visited by changing it to 0
        grid[a][b] = '0';
        helper(grid, a+1, b);
        helper(grid, a-1, b);
        helper(grid, a, b+1);
        helper(grid, a, b-1);
    }
}