class ArmstrongExample
{
public static void main(String args[])
{
	int num=153;
	int temp,sum=0,rem;
	temp=num;
	while(num>0)
	{
		rem=num%10;
		num=num/10;
		sum=sum+(rem*rem*rem);	
	}
	if(temp==sum)
	{
		System.out.println("Armstrong number");
	}	
	else
	{
		System.out.println("Not Armstrong number");
	}
}
}