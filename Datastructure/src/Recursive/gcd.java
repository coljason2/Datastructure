package Recursive;

public class gcd
{
    //最大公因數
    gcd(int a, int b)
    {
	System.out.println(count(a,b));
    }

    private int count(int a, int b)
    {
	if(a%b==0)
	    return b;
	else
	    return count(b,a%b);

    }

    public static void main(String[] args)
    {
	gcd g =new gcd(50,15);

    }

}
