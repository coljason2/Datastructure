package BST;

public class BinaryTree
{

    private BTNode root;

    private void inorder(BTNode r)
    {
	if(r!=null)
	{
	    inorder(r.left);
	    System.out.print(r.getData()+" ");
	    inorder(r.right);
	}
    }

    public static void main(String[] args)
    {
	BinaryTree BT=new BinaryTree();
	// BT.insert(50);
	// BT.insert(60);
	// BT.insert(70);
	// BT.insert(80);
	// BT.insert(55);
	// BT.insert(11);
	BT.inorder(BT.root);
    }

}
