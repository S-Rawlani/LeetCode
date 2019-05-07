class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int paths[][] = new int[n][m];
        if(obstacleGrid[0][0] == 0)
            paths[0][0] = 1;
        for(int i = 1; i < n; i++){
            if(obstacleGrid[i][0] == 0){
                paths[i][0] = paths[i-1][0];
            }
        }
        for(int i = 1; i < m; i++){
            if(obstacleGrid[0][i] == 0){
                paths[0][i] = paths[0][i-1];
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(obstacleGrid[i][j] == 0){
                    paths[i][j] = paths[i-1][j] + paths[i][j-1];
                }
            }
        }
        return paths[n-1][m-1];
    }
}