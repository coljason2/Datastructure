package Heap;

import java.util.Arrays;

public class HeapSort
{

    private static int[] a;
    private static int heapsize;
    private static int left;
    private static int right;
    private static int largest;

    public static void buildheap(int[] a)
    {
	heapsize=a.length-1;
	for(int i=heapsize/2; i>=0; i--)
	{
	    maxheapify(a,i);
	}
    }

    public static void maxheapify(int[] a, int index)
    {
	left=2*index;
	right=2*index+1;

	if(left<=heapsize&&a[left]>a[index])
	    largest=left;
	else
	    largest=index;

	if(right<=heapsize&&a[right]>a[largest])
	    largest=right;

	if(largest!=index)
	{
	    swap(index,largest);
	    maxheapify(a,largest);// ���_heap��
	}
    }

    public static void swap(int i, int j)
    {
	int t=a[i];
	a[i]=a[j];
	a[j]=t;
    }

    public static void sort(int[] myarray)
    {
	a=myarray;
	buildheap(a);
	for(int i=heapsize; i>0; i--)
	{
	    swap(0,i);// �̫�@�Ӹ�MAX�洫
	    heapsize=heapsize-1;// MAX POP�X�h
	    maxheapify(a,0);// ���̤j��
	}
    }

    public static void main(String[] args)
    {
	int[] numbers= { 55, 2, 93, 1, 23, 10, 66, 12, 7, 54, 3 };
	System.out.println(Arrays.toString(numbers));
	sort(numbers);
	System.out.println(Arrays.toString(numbers));
    }
}