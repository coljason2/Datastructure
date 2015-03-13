package Recursive;

public class fib
{
    //¶O¦¡¼Æ¦C
    int nonrecursive(int n)
    {
	int a=0, b=1, c=0;
	for(int i=0; i<n-1; i++)
	{
	    c=b+a;
	    a=b;
	    b=c;
	}
	return c;
    }

    int recursvie(int n)
    {

	if(n==0)
	    return 0;
	else if(n==1)
	    return 1;
	else
	    return recursvie(n-1)+recursvie(n-2);

    }

    public static void main(String[] args)
    {
	fib f=new fib();
	System.out.println(f.recursvie(9));
	System.out.println(f.nonrecursive(9));
    }

}
