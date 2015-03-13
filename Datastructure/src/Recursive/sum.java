package Recursive;

public class sum
{
    //¶¥¼hÁ`©M
    sum(int n)
    {
	System.out.println(count(n));
    }

    private int count(int n)
    {
	if(n==0)
	    return 0;
	return n+count(n-1);
    }

    public static void main(String[] args)
    {
	sum s=new sum(10);

    }

}
