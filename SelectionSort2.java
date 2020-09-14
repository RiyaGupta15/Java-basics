import java.util.Scanner;
class SelectionSort2 
{  
public static void main(String a[])
{  
        int size,i,j,temp;
	int arr[]=new int[50];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	size=sc.nextInt();
	System.out.println("enter elements of array");
	for(i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("sorting elements using selection sort");
	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(arr[i]>arr[j])
			{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
	}
	System.out.println("after sorting the array is");
	for(i=0;i<size;i++)
	{
		System.out.print(arr[i]+ " ");
	}
}  
} 