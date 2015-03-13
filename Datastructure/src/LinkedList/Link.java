package LinkedList;

public class Link
{

    Link next;
    int element;

    Link(int n)
    {
	element=n;
    }

    void add(int n)
    {
	if(next==null)
	    next=new Link(n);
	else
	{
	    next.add(n);
	}
    }

}
