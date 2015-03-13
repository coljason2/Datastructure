package Recursive;

public class combination
{
    //C(n,m)  
    combination(int n, int m)
    {
	if(n>m)
	    System.out.println(count(n,m));
	else
	    System.out.println("Incorrect input ");
    }

    private int count(int n, int m)
    {
	if(n==m)
	    return 1;
	else if(m==1)
	    return n;
	else
	    return count(n-1,m)+count(n-1,m-1);
    }
    
    public static void main(String[] args)
    {
	combination c=new combination(10,3);

    }

}
