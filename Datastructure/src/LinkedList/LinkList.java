package LinkedList;

public class LinkList
{
    Link head;

    public void addLink(int data)
    {
	if(head==null)
	    head=new Link(data);
	else
	{
	    head.add(data);
	}
    }

    public void print()
    {
	Link temp=head;
	while (temp!=null)
	{
	    System.out.print(temp.element+"->");
	    temp=temp.next;
	}
	System.out.println();
    }

    public void reverse()
    {
	Link now;
	Link next;
	Link temp;
	now=head;
	next=head.next;
	temp=next.next;
	now.next=null;
	while (next.next!=null)
	{
	    next.next=now;
	    now=next;
	    next=temp;
	    temp=temp.next;
	}
	next.next=now;
	head=next;
    }

    public void delete(int n)
    {
	Link now=head;

	while (now!=null&&now.next!=null)
	{
	    if(now.next.element==n)
	    {
		now.next=now.next.next;
	    }
	    now=now.next;
	}

    }

    public static void main(String[] args)
    {
	LinkList t=new LinkList();
	t.addLink(10);
	t.addLink(66);
	t.addLink(99);
	t.addLink(88);
	t.addLink(44);
	t.addLink(25);
	t.addLink(88);
	t.addLink(25);
	t.addLink(99);
	t.print();
	// t.reverse();
	// t.print();
	t.delete(99);
	t.print();
    }

}
