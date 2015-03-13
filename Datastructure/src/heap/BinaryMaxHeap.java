package Heap;

//colplete tree buttom up ª©
public class BinaryMaxHeap
{
    int[] array;
    int heapsize;

    public BinaryMaxHeap(int size)
    {
	array=new int[size];
	heapsize=-1;
    }

    public void insert(int node)
    {
	if(heapsize==array.length-1)
	{
	    System.out.println("heap is Full");
	}
	else
	{
	    heapsize++;
	    array[heapsize]=node;
	    BottomUp(heapsize);
	}
    }

    public void BottomUp(int index)
    {
	int pIndex=(index-1)/2;
	int temp=array[index];
	if(array[pIndex]<array[index])
	{
	    array[index]=array[pIndex];
	    array[pIndex]=temp;
	    BottomUp(pIndex);
	}
	else
	    return;
    }

    public void print()
    {
	for(int i=0; i<=heapsize; i++)
	{
	    System.out.print(array[i]+" ");
	}
    }

    public static void main(String[] args)
    {
	BinaryMaxHeap maxheap=new BinaryMaxHeap(5);
	maxheap.insert(3);
	maxheap.insert(5);
	maxheap.insert(9);
	maxheap.insert(9);
	maxheap.insert(9);
	maxheap.print();
    }
}
