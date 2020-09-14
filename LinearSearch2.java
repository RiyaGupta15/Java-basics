import java.util.*;
class LinearSearch2
{
public static void main(String args[])
{
	int arr[]=new int[50];
	int size;
	int c;
	Scanner sc=new Scanner(System.in);
	int key;
	System.out.println("enter the size of array");
	size=sc.nextInt();
	System.out.println("enter elements of array");
	for(c=0;c<size;c++)
	{
		arr[c]=sc.nextInt();
	}
	System.out.println("enter key element to be found");
	key=sc.nextInt();
	for(c=0;c<size;c++)
	{
		if(arr[c]==key)
		{	
		System.out.println("the key element is present at " + c + "position");
		}
	}
}
}