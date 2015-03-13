package AdvanceSort;

import java.util.Arrays;

public class Quicksort
{

    int[] data;

    public Quicksort(int[] a)
    {
	this.data=a;
    }

    public void sort(int l, int r)
    {
	int index=partion(l,r);
	if(index-1>l)
	    sort(l,index-1);
	if(index<r)
	    sort(index,r);

    }

    private int partion(int l, int r)
    {
	int pivot=(l+r)/2;
	while (l<r)
	{
	    while (data[l]<data[pivot])
		l++;
	    while (data[r]>data[pivot])
		r--;
	    if(l<=r)
	    {
		swap(l,r);
		l++;
		r--;
	    }
	}
	return l;
    }

    private void swap(int l, int r)
    {
	int temp=data[l];
	data[l]=data[r];
	data[r]=temp;
    }

    public static void main(String[] args)
    {
	int[] a= { 90, 47, 3, 8, 77, 9, 3, 11, 56, 6 };
	Quicksort q=new Quicksort(a);
	q.sort(0,a.length-1);
	System.out.println(Arrays.toString(a));
    }
}
