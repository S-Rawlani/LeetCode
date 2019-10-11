class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> eachPath = new ArrayList<>();
        helper(root, paths, eachPath, sum); 
        return paths;
    }
    public void helper(TreeNode root, List<List<Integer>> paths, List<Integer> eachPath, int sum)
    {
        if(root == null)
            return;
        eachPath.add(root.val);
        
        if(root.left == null && root.right == null)
        {
            if(root.val == sum)
                paths.add(new ArrayList<>(eachPath)); 
            return;
        }
        
        if(root.left != null)
        {
            helper(root.left, paths, eachPath, sum-root.val);
            eachPath.remove(eachPath.size() -1);
        }
        
        if(root.right != null)
        {
            helper(root.right, paths, eachPath, sum-root.val);
            eachPath.remove(eachPath.size() -1);
            
        }   
       
    }
    
}