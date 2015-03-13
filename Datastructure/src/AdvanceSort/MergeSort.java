package AdvanceSort;

import java.util.Arrays;

public class MergeSort
{
    private int[] data;
    private int[] temp;

    MergeSort(int[] a)
    {
	this.data=a;
	this.temp=new int[a.length];
	sort(0,a.length-1);
    }

    private void sort(int i, int j)
    {
	int mid;
	if(i<j)
	{
	    mid=i+(j-i)/2;
	    sort(i,mid);
	    sort(mid+1,j);
	    merge(i,mid,j);
	}

    }

    private void merge(int i, int m, int j)
    {
	for(int n=i; n<=j; n++)
	{
	    temp[n]=data[n];
	}

	int a=i;
	int mid=m+1;
	int c=i;
	while (a<=m&&mid<=j)
	{
	    if(temp[a]<=temp[mid])
	    {
		data[c]=temp[a];
		a++;
	    }
	    else
	    {
		data[c]=temp[mid];
		mid++;
	    }
	    c++;
	}
	while (a<=m)
	{
	    data[c]=temp[a];
	    a++;
	    c++;
	}

    }

    public static void main(String[] args)
    {
	int[] a= { 0, 5, 6, 77, 8, 2, 4, 6, 3, 11, 32, 100 };
	MergeSort m=new MergeSort(a);
	System.out.println(Arrays.toString(a));

    }

}
