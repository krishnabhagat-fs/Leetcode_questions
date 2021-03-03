class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> list=new ArrayList<>();
        trav(root,list);
        return list; 
    }
    public static void trav(TreeNode root,List<Integer> list)
    {
        if(root==null)
            return;
        
        trav(root.left,list);
        list.add(root.val);
        trav(root.right,list);
    }
}
