class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list=new ArrayList();
        if(root==null)
            return list;
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.remove();
                if(i==0)
                    list.add(temp.val);
                if(temp.right!=null)
                    q.add(temp.right);
                if(temp.left!=null)
                    q.add(temp.left);
            }
        }
        return list;
    }
}
