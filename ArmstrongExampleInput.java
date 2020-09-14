import java.util.*;
class ArmstrongExampleInput
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
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