package Array;

import java.util.Arrays;
import java.util.Random;

public class matrix
{

    private int[][] a;
    private int[][] b;
    private int[][] c;
    private int n=new Random().nextInt(5);

    public matrix()
    {

	a=new int[n][n];
	b=new int[n][n];
	c=new int[n][n];
	initialize();
	Merge();
    }

    private void initialize()
    {
	for(int i=0; i<n; i++)
	{
	    for(int j=0; j<n; j++)
	    {
		a[i][j]=new Random().nextInt(10);
		b[i][j]=new Random().nextInt(10);
	    }
	}
	print(a);
	print(b);
    }

    private void print(int[][] a2)
    {

	for(int i=0; i<n; i++)
	{
	    System.out.print("[");
	    for(int j=0; j<n; j++)
	    {
		System.out.print(a2[i][j]+",");
	    }
	    System.out.println("]");
	}
	System.out.println();
    }

    public void Merge()
    {
	int sum;
	for(int k=0; k<n; k++)
	{
	    for(int i=0; i<n; i++)
	    {
		sum=0;
		for(int j=0; j<n; j++)
		{
		    sum=sum+a[k][j]*b[j][i];
		}
		c[k][i]=sum;
	    }
	}
	print(c);
    }

    public static void main(String[] args)
    {
	matrix m=new matrix();
	// m.print(a2)
    }

}
