package Recursive;

public class power
{
    // n^exp nªº¦¸¤è
    power(int n, int exp)
    {
	System.out.println(count(n,exp));
    }

    private long count(int n, int exp)
    {
	if(exp==0)
	    return 1;
	else if(exp==1)
	    return n;
	return n*count(n,exp-1);
    }

    public static void main(String[] args)
    {
	power p=new power(2,16);
    }

}
