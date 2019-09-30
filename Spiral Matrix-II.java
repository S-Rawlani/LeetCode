class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        if (n == 0)
            return matrix;
        
        int number = 1;
        int rstart = 0;
        int cstart = 0;
        int rend = n-1;
        int cend = n-1;
        while(rstart <= rend && cstart <= cend)
        {
            for(int i = cstart; i <= cend; i++)
            {
                matrix[rstart][i] = number++;
            }
            rstart++;
            for(int i = rstart; i <= rend; i++)
            {
                matrix[i][cend] = number++;
            }
            cend--;
            for(int i = cend; i >= cstart; i--)
            {
                matrix[rend][i] = number++;
            }
            rend--;
            for(int i = rend; i >= rstart; i--)
            {
                matrix[i][cstart] = number++;
            }
            cstart++;
        }
        return matrix;
    }
}