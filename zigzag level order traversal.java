class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean zigzag = false;
        while(!queue.isEmpty())
        {
            int len = queue.size();
            List<Integer> levelNodes = new ArrayList<>();
            for(int i = 0; i < len; i++)
            {
                TreeNode current = queue.poll();
                if(zigzag)
                {
                    levelNodes.add(0, current.val);
                }
                else
                {
                    levelNodes.add(current.val);
                }
                if(current.left != null)
                    queue.add(current.left);
                if(current.right != null)
                    queue.add(current.right);
            }
            ans.add(levelNodes);
            zigzag = !zigzag;    
        }
        return ans;    
        
    }
}