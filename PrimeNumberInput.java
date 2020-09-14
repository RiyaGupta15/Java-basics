import java.util.*;
class PrimeNumberInput
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	if(isPrime(n))
	{
		System.out.println("Prime number");
	}
	else
	{
		System.out.println("Not prime");
	}
}
public static boolean isPrime(int n)
{
	if(n<=1)
	{
		return false;
	}
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
		return false;
		}
	}
	return true;
}
}