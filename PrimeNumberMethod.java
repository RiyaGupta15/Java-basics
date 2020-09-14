class PrimeNumberMethod
{
static void checkPrime(int n)
{
	int i,flag=0;
	if(n==0 || n==1)
	{
		System.out.println("Not Prime");
	}
	else
	{
		for(i=2;i<=n/2;i++)
		{
		if(n%i==0)
		{
		System.out.println("Not prime");
		flag=1;
		break;
		}
		}
		if(flag==0)
		{
		System.out.println("Prime number");
		}
	}
}
public static void main(String args[])
{
	checkPrime(1);
	checkPrime(3);
	checkPrime(17);
	checkPrime(20);
}
}