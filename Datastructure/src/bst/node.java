package BST;

public class Node
{
    int data;
    Node left;
    Node right;

    public Node(int value)
    {
	data=value;
    }

    public void add(int value)
    {

	if(value>data)
	{
	    if(right==null)
		right=new Node(value);
	    else
		right.add(value);
	}
	else
	{
	    if(left==null)
		left=new Node(value);
	    else
		left.add(value);
	}
    }

}
