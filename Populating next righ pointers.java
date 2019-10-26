class Solution {
    public Node connect(Node root) {
        
        Queue<Node> q = new LinkedList<>();
        if(root == null)
            return root;
        q.offer(root);
        
        while(!q.isEmpty())
        {
            int len = q.size();
            int size = len;
            for(int i = 0 ; i < len; i++)
            {
                
                Node r = q.poll();

                if(size-- <= 1)
                    r.next = null;
                else
                    r.next = q.peek();
                
                if(r.left != null)
                    q.offer(r.left);
                if(r.right != null)
                    q.offer(r.right);
            }
        }
        return root;
        
    }
}