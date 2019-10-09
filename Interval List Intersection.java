class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        
        List<int[]> innerList = new ArrayList<>();
        int i = 0; 
        int j = 0 ;
        while(i < A.length && j < B.length)
        {
            int first = Math.max(A[i][0], B[j][0]);
            int second = Math.min(A[i][1], B[j][1]);
            if(first <= second)
                innerList.add(new int[]{first, second});
            if(A[i][1] > B[j][1])
                j++;
            else
                i++;
        }
        int[][] answer = new int[innerList.size()][2];
        int k = 0;
        for(int[] nums : innerList)
        {
            answer[k] = nums;
            k++;
        }
        return answer;
    }
}