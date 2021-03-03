class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        trav(root,list);
        return list;
    }
    public static void trav(TreeNode root,List<Integer> list)
    {
        if(root==null)
            return;
        
        trav(root.left,list);
        
        trav(root.right,list);
        
        list.add(root.val);
    }
}
