class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightValues = new ArrayList<>();
        if(root == null)
            return rightValues;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int len = queue.size();
            
            for(int i = 0; i < len; i++)
            {     
                TreeNode curr = queue.poll();
                if(i == len-1)
                {
                    rightValues.add(curr.val);
                }
                if(curr.left != null)
                {
                    queue.add(curr.left);
                }
                if(curr.right != null)
                {
                    queue.add(curr.right);
                }
            }
        }
        return rightValues;
    }
}