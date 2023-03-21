class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0 ;
        int maxWidth = 0 ;
        // pair to add node  and its index . 
        // if root index is i its left child index is 2i+1  and right child index 2i+2
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root,0));
        while(!q.isEmpty()){
            int n = q.size();
          // keep the track of 1st node in current level as width will be leftnode index - right node index +1 
            Pair<TreeNode, Integer> head = q.peek();
            Pair<TreeNode, Integer> ele = null;
            for(int i= 0 ; i< n ;i++){
                ele = q.poll();
                TreeNode  node = ele.getKey();
                if(node.left !=null)
                    q.add(new Pair<>(node.left, 2 * ele.getValue()));
                 if(node.right !=null)
                    q.add(new Pair<>(node.right, 2 * ele.getValue()+1));
            }
         maxWidth = Math.max(maxWidth, ele.getValue() - head.getValue() + 1);
        }
        return maxWidth;
    }
}
