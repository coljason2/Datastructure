package Search;

public class Search
{

    public int linesearch(int n, int[] data)
    {
	int findindex=-1;
	for(int i : data)
	{
	    findindex=findindex+1;
	    if(i==n)
		return findindex;
	}
	return -1;
    }

    int binarySearch(int[] array, int value, int left, int right)
    {
	if(left>right)
	    return -1;
	int middle=(left+right)/2;
	if(array[middle]==value)
	    return middle;
	else if(array[middle]>value)
	    return binarySearch(array,value,left,middle-1);
	else
	    return binarySearch(array,value,middle+1,right);
    }

    public int binary(int des, int[] data)
    {
	int low=0;
	int upper=data.length-1;

	while (low<=upper)
	{
	    int mid=(low+upper)/2;
	    if(data[mid]<des)
		low=mid+1;
	    else if(data[mid]>des)
		upper=mid-1;
	    else
		return mid;
	}
	return -1;
    }

    public static void main(String[] args)
    {
	Search s=new Search();
	int[] a= { 1, 2, 3, 5, 6, 8, 9, 10, 50 };
	System.out.println(s.binary(50,a));
    }

}
