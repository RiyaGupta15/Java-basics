import java.util.*;
class PalindromeExampleInput
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int rem,sum=0,temp;
	temp=num;
	while(num>0)
	{
		rem=num%10;
		sum=rem+(sum*10);
		num=num/10;
	}
	if(temp==sum)
	{
		System.out.println("Palindrome number");
	}
	else
	{
		System.out.println("Not palindrome number");
	}
}
}