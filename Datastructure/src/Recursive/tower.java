package Recursive;

public class tower
{
    //ªe¤º¶ð
    tower(int n)
    {
	count(n,"A","B","C");
    }

    private void count(int n, String a, String b, String c)
    {
	if(n==1)
	    System.out.println(a+" move to "+c);
	else
	{
	    count(n-1,a,c,b);
	    count(1,a,b,c);
	    count(n-1,b,a,c);
	}
    }

    public static void main(String[] args)
    {
	tower t=new tower(3);

    }

}
