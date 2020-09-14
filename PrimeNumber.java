class PrimeNumber
{
public static void main(String args[])
{
	int num=13,flag=0;
	if(num==0 || num==1)
	{
		System.out.println("not prime");
	}
	else
	{
		for(int i=2;i<=num/2;i++)
		{
		if(num%2==0)
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
}