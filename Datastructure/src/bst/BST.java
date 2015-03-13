package BST;

public class BST
{
    Node root;

    public void add(int value)
    {
	if(root==null)
	    root=new Node(value);
	else
	    root.add(value);
    }

    public void preorder(Node node)
    {
	System.out.print(node.data+" ");
	if(node.left!=null)
	    preorder(node.left);
	if(node.right!=null)
	    preorder(node.right);
    }

    public void postorder(Node node)
    {
	if(node.left!=null)
	    preorder(node.left);
	if(node.right!=null)
	    preorder(node.right);
	System.out.print(node.data+" ");
    }

    public void inorder(Node node)
    {
	if(node.left!=null)
	    preorder(node.left);
	System.out.print(node.data+" ");
	if(node.right!=null)
	    preorder(node.right);
    }

    public static void main(String[] args)
    {
	BST bst=new BST();
	bst.add(10);
	bst.add(20);
	bst.add(30);
	bst.add(40);
	bst.add(5);
	bst.add(9);
	bst.postorder(bst.root);
	System.out.println();
	bst.preorder(bst.root);
	System.out.println();
	bst.inorder(bst.root);
    }
}
