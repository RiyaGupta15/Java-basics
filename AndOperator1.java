class AndOperator1
{
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a<b&&a<c);//&& doesnt check second condition if first is false
		System.out.println(a<b&a<c);//& checks both condition whether first condition is true or false
	}
}