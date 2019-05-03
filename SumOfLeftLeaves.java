class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return sum;
        helper(root, 'n');
        return sum;
    }
    public void helper(TreeNode root, char s) {
        if(root.left == null && root.right == null && s=='l'){
            sum += root.val;
        }
        if(root.left != null){
            helper(root.left, 'l');
        }
        if(root.right != null){ 
            helper(root.right, 'r');
        }         
        
    }
}