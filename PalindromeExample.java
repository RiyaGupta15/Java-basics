class PalindromeExample
{
public static void main(String args[])
{
	int num=434;
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