package binarytree;

public class TreeNode
{
public int value;
public TreeNode left, right;

public void printTreePreOrder(TreeNode node) {
    if (node != null) {
        System.out.print(node.value + " ");
        printTreePreOrder(node.left);
        printTreePreOrder(node.right);
    }
}

public static void main(String[] args) {
	/*TreeNode root= new TreeNode ();
	root.value=10;
	root.left= new TreeNode ();
	root.left.value=7;
	root.left.left = new TreeNode();
	root.left.left.value=3;
	root.left.right = new TreeNode();
	root.left.right.value = 9;
	
	root.right = new TreeNode();
	root.right.value = 22;
	root.right.left = new TreeNode();
	root.right.left.value = 12;
	root.right.right = new TreeNode();
	root.right.right.value = 67;
	root.printTreePreOrder(root);
	*/
	TreeNode root= new TreeNode ();
	root.value=10;
	root.left= new TreeNode ();
	root.left.value=7;
	root.left.left = new TreeNode();
	root.left.left.value=3;
	root.left.left.left= new TreeNode();
	root.left.left.left.value=5;
	root.left.left.right= new TreeNode();
	root.left.left.right.value=45;
	root.left.right = new TreeNode();
	root.left.right.value = 9;
	root.left.right.left = new TreeNode();
	root.left.right.left.value =4;
	root.left.right.right = new TreeNode();
	root.left.right.right.value=80;
	
	root.right = new TreeNode();
	root.right.value = 22;
	root.right.left = new TreeNode();
	root.right.left.value = 12;
	root.right.left.left= new TreeNode();
	root.right.left.left.value=12;
	root.right.left.right = new TreeNode();
	root.right.left.right.value = 35;
	
	root.right.right = new TreeNode();
	root.right.right.value = 67;
	root.right.right.left=new TreeNode();
	root.right.right.left.value=1;
	root.right.right.right = new TreeNode();
	root.right.right.right.value=37;
	root.printTreePreOrder(root);
}
}

