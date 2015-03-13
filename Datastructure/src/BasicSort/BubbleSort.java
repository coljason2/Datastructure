package BasicSort;

import java.util.Arrays;

public class BubbleSort
{
    private int[] data;

    BubbleSort(int[] a)
    {
	data=a;
	for(int i=a.length-1; i>=0; i--)
	    for(int j=0; j<i; j++)
	    {
		if(data[j]>data[j+1])
		    swap(j,j+1);
	    }
    }

    private void swap(int j, int i)
    {
	int temp=data[j];
	data[j]=data[i];
	data[i]=temp;

    }

    public static void main(String[] args)
    {
	int[] a= { 0, 5, 6, 77, 8, 2, 4, 6, 3, 11, 32, 100 };
	BubbleSort b=new BubbleSort(a);
	System.out.println(Arrays.toString(a));
    }

}
