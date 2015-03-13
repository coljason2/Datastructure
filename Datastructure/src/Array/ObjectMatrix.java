package Array;

import java.util.Random;

public class ObjectMatrix
{
    private int[][] matrix;

    public int[][] getMatrix()
    {
	return matrix;
    }

    public ObjectMatrix(int[][] element)
    {
	matrix=element;
    }

    public ObjectMatrix(int n, int m)
    {
	matrix=new int[n][m];
	for(int i=0; i<n; i++)
	{
	    for(int j=0; j<m; j++)
	    {
		matrix[i][j]=new Random().nextInt(100);
	    }
	}
    }

    public ObjectMatrix crossMatrix(ObjectMatrix a, ObjectMatrix b)
    {

	return b;
    }

    public static void main(String[] args)
    {
	ObjectMatrix w=new ObjectMatrix(8,3);
	ObjectMatrix a=new ObjectMatrix(8,3);
	ObjectMatrix c=new ObjectMatrix(8,3);
	System.out.println(w.hashCode());
	System.out.println(a.hashCode());
	System.out.println(c.hashCode());
	c=a;
	System.out.println(c.hashCode());
    }

}
