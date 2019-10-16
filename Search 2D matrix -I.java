class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        for(int i = 0; i < matrix.length; i++)
        {
            if(target == matrix[i][0] || target == matrix[i][matrix[i].length -1])
                    return true;
            for(int j = 1 ; j < matrix[i].length-1; j++)
            {      
                if(target > matrix[i][0] && target < matrix[i][matrix[i].length -1])
                {
                    if(target == matrix[i][j])
                        return true;
                }
                else
                    break;
            }
        }
        return false;
        
    }
}