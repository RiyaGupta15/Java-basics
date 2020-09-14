class AddingShort
{
	public static void main(String args[])
	{
		short a=10;
		short b=10;
		//a+b will be compile time error becuase a+b is int
		c=(short)(a+b); //20
		System.out.println(c);
	}
}