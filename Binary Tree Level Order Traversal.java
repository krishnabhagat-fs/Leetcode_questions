class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
            return res;
        q.add(root);
        while(!q.isEmpty())
        {
            int val=q.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<val;i++)
            {
                TreeNode temp=q.remove();
                list.add(temp.val);
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
            res.add(list);
        }
        return res;
    }
}
