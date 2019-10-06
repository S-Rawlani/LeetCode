class Solution {
    //DFS
    public int maxLevelSum(TreeNode root) {
       List<Integer> list = new ArrayList<>();
        levelSum(list, root, 0);
        int maxLevel = 0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(maxLevel) < list.get(i))
            {
                maxLevel = i;
            }
        }
        return maxLevel+1;
        
    }
    public void levelSum(List<Integer> list, TreeNode root, int level)
    {
        if(root == null)
            return;
        if(level == list.size())
        { 
            list.add(root.val);
        }
        else
        {
            list.set(level, list.get(level) + root.val);
        }
        levelSum(list, root.left, level+1);
        levelSum(list, root.right, level+1);
    }
}