package BasicSort;

import java.util.Arrays;

public class SelectSort
{
    private int[] data;

    SelectSort(int[] a)
    {
	data=a;
	for(int i=0; i<a.length; i++)
	{
	    int min=i;
	    for(int j=i; j<a.length; j++)
	    {
		if(data[j]<data[min])
		    min=j;
	    }
	    if(min!=i)
		swap(min,i);
	}
    }

    private void swap(int min, int i)
    {
	int temp=data[min];
	data[min]=data[i];
	data[i]=temp;
    }

    public static void main(String[] args)
    {
	int[] a= { 0, 5, 6, 77, 8, 2, 4, 6, 3, 11, 32, 100 };
	SelectSort s=new SelectSort(a);
	System.out.println(Arrays.toString(a));
    }

}
