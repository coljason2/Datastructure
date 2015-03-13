package Stack;

public class Stack
{
    private int size;
    private int[] Stack;
    private int current;

    Stack(int szie)
    {
	this.size=szie;
	Stack=new int[size];
	current=0;
    }

    public boolean isEmpty()
    {
	return current==0;
    }

    public boolean isFull()
    {
	return current==size;
    }

    public int pop()
    {
	if(!isEmpty())
	    return Stack[--current];
	else
	    return -1;
    }

    public void push(int data)
    {
	if(!isFull())
	{
	    Stack[current++]=data;
	    System.out.println(data+" is correct push");
	}
	else
	    System.out.println("Satck is full");
    }

    public static void main(String[] args)
    {
	Stack satck=new Stack(3);
	satck.push(10);
	satck.push(5);
	satck.push(6);
	System.out.println(satck.pop());
	System.out.println(satck.pop());
	System.out.println(satck.pop());
	System.out.println(satck.pop());
    }

}
