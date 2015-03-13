package Recursive;

public class fact
{
    // N!=1*2*3*4*5*6....*N
    fact(int n)
    {
	System.out.println(count(n));
    }

    private long count(int n)
    {
	if(n<=1)
	    return 1;

	return n*count(n-1);
    }

    public static void main(String[] args)
    {
	fact f=new fact(15);

    }

}
