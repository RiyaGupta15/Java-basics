class OrOperator
{
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a>b||a<c);//doesnt check second condition if first is true
		System.out.println(a>b|a<c);//checks both the conditions 
		System.out.println(a>b||a++<c);//true
		System.out.println(a);//10 bcoz second condition is not checked
		System.out.println(a>b|a++<c);//true|true=true
		System.out.println(a);//11 bcoz second condition is checked
	}
}