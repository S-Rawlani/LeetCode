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
        left = toDecimal(left);
        right = toDecimal(right);
        int finalSum = left + right;
        return finalSum;
    }

 public int toDecimal(int binary)
    {
        int count = 0;
        int num = binary;
        while(num > 0)
        {
         num = num /10;
            count++;
        }
        int decimal = 0;
        int last = 0;
        
        for(int i = 0; i < count; i++)
        {
            last = binary % 10;
            binary = binary/10;
            decimal += last*Math.pow(2,i);
        }
        return decimal;
        
    }
        
        
}