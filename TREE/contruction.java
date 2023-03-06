import java.util.ArrayList;
import java.util.Arrays;

public class Tree {
	
	static ArrayList<Integer>inorder = new ArrayList<>();
	static ArrayList<Integer>preorder = new ArrayList<>();
	static ArrayList<Integer>postorder = new ArrayList<>();
	
	public Node constructTree() {
		Node root = new Node(0,new Node(1), new Node(2));
		return root;
	}
	public void inorder(Node root) {
		if(root==null) return;
		inorder(root.left);
		inorder.add(root.val);
		inorder(root.right);
		
	}
	public void preorder(Node root) {
		if(root==null) return;
		preorder.add(root.val);
		preorder(root.left);
		preorder(root.right);
			
	}
	public void postorder(Node root) {
		if(root==null) return;
		postorder(root.left);
		postorder(root.right);
		postorder.add(root.val);
		
	}
	public static void main(String[] args) {
		Tree obj = new Tree();
		Node root = obj.constructTree();
		
		obj.preorder(root);
		obj.inorder(root);
		obj.postorder(root);
		
		System.out.print(preorder);
		System.out.print(inorder);
		System.out.print(postorder);
	}
		
}


// ----- Node class 

public class Node {
	int val;
	Node left;
	Node right;
	
	Node(int val){
		this.val= val;
	}
	Node(int val,Node left, Node right){
		this.left = left;
		this.right= right;
		this.val= val;
	}

}

//-------------- TIME COMPLEXITY 
Time complexity of the tree traversal of as we visit each node once  O(n) 
Scace complexity 
If we don’t consider the size of the stack for function calls then O(1). Otherwise, O(h) where h is the height of the tree.

The height of the skewed tree is n (no. of elements) so the worst space complexity is O(n). Height is (Log n) for the balanced tree so the best space complexity is O(Log n).


	
