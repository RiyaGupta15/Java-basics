class AddingLowerType
{
	public static void main(String args[])
	{
		byte a=30;
		byte b=10;
		//byte c=a+b will be compile time error because a+b will be int
		byte c=(byte)(a+b);
		System.out.println(c);
	}
}