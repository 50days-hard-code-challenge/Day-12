
    class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
        {
            return null;
        }
        if(root.val==val)
        {
            return root;
        }
       // TreeNode cur=root;
        while(root!=null)
        {
        if(root.val<val){
            if(root.right!=null && root.right.val==val)
            {
               return root.right;
            }else
            {
                root=root.right;
            }
        }else
        {
            if(root.left!=null && root.left.val==val)
            {
                return root.left;
            }else
            {
                root=root.left;
            }
          }

        }
        return root;
        
    }
}
