class Solution {
    int max_level = 0;
    List<Integer> li = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)
            return li;
        li.add(root.val);
        RSV(root, 0);
        return li;
    }
    public void RSV(TreeNode t, int level){
        if(level > max_level){
            max_level = level;
            li.add(t.val);
        }
        if(t.right != null){
            RSV(t.right, level+1);
        }
        if(t.left != null){
          RSV(t.left, level+1);  
        }     
    }
}