package BasicSort;

import java.util.Arrays;

public class InsertionSort
{

    InsertionSort(int[] data)
    {
	int n;
	int j;
	for(int i=1; i<data.length; i++)
	{
	    n=data[i];
	    for(j=i-1; j>=0&&data[j]>n; j--)
		data[j+1]=data[j];
	    data[j+1]=n;
	}
    }

    public static void main(String[] args)
    {
	int[] a= { 0, 5, 6, 77, 8, 2, 4, 6, 3, 11, 32, 100 };
	InsertionSort s=new InsertionSort(a);
	System.out.println(Arrays.toString(a));
    }

}
