package BST;

public class BTNode
{
    BTNode left;
    BTNode right;
    int value;

    public BTNode(int a)
    {
	value=a;
    }

    public int getData()
    {
	return value;
    }

    public void setData(int data)
    {
	this.value=data;
    }

}
