class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        trav(root,list);
        return list;
    }
    public static void trav(TreeNode root,List<Integer> list)
    {
        if(root==null)
            return;
        list.add(root.val);
        trav(root.left,list);
        trav(root.right,list);
    }
}
