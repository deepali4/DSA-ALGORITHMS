class Solution {
   
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>  res= new ArrayList<>();
        helper(root,"",res);
        return res;
    }
    public void helper(TreeNode root, String path,List<String>  res)
    {
        if(root.left==null&& root.right==null)res.add(path+root.val);
        if(root.left!=null)helper(root.left,path+root.val+"->",res);
        if(root.right!=null)helper(root.right,path+root.val+"->",res);
        
    }
}
