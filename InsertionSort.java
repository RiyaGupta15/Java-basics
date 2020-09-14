class InsertionSort
{  
public static void insertionSort(int[] arr)
{  
	int n=arr.length;
	for(int j=1;j<n;j++)
	{
		int key=arr[j];
		int i=j;
		while((i>0)&&(arr[i-1]>key))
		{
			arr[i]=arr[i-1];
			i--;
		}
		arr[i]=key;
	} 
}  
       
public static void main(String a[])
{  
        int[] arr = {9,14,3,2,43,11,58,22};
	int i;  
        System.out.println("Before Insertion Sort");  
        for(i=0;i<arr.length;i++)			
	{  
            System.out.print(arr[i]+" ");  
        }  
        System.out.println();  
          
        insertionSort(arr);//sorting array using insertion sort  
         
        System.out.println("After Insertion Sort");  
        for(i=0;i<arr.length;i++)
	{  
            System.out.print(arr[i]+" ");  
        }  
}  
} 