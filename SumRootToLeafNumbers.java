class Solution {
    public int sumNumbers(TreeNode root) {
        int answer = sumRoot(root, 0);
        return answer;
    }
    public int sumRoot(TreeNode root, int sum)
    {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
        {
           return sum*10 + root.val;
        }
        int left = sumRoot(root.left, sum*10 + root.val);
        int right = sumRoot(root.right, sum*10 + root.val);
        int finalSum = left + right;
        return finalSum;
    }
        
}