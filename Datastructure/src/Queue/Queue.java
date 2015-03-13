package Queue;

public class Queue
{
    private int[] Queue;
    private int size;
    private int current;
    private int front;// ÀY
    private int rear;// §À

    Queue(int n)
    {
	size=n;
	Queue=new int[n];
	current=0;
	rear=0;
	front=0;
    }

    boolean isFull()
    {
	return current==size;
    }

    boolean isEmpty()
    {
	return current==0;
    }

    public void add(int n)
    {
	if(!isFull())
	{
	    Queue[rear++]=n;
	    rear=rear%size;
	    current++;
	    System.out.println(n+" is correct add");
	}
	else
	    System.out.println("Queue is Full "+n);
    }

    public int pop()
    {
	if(!isEmpty())
	{
	    int temp=Queue[front++];
	    front=front%size;
	    current--;
	    return temp;
	}
	else
	{
	    System.out.println("Queue is Empty");
	    return 0;
	}
    }

    public static void main(String[] args)
    {
	Queue q=new Queue(3);
	q.add(50);
	q.add(40);
	q.add(90);
	q.add(90);
	System.out.println(q.pop());
	q.add(77);
	System.out.println(q.pop());
	System.out.println(q.pop());
	System.out.println(q.pop());

    }

}
