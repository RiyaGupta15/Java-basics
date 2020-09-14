class UnaryOperator2
{
	public static void main(String args[])
	{
		int a=10;
		int b=-10;
		boolean c=true;
		boolean d=false;
		System.out.println(~a); //(-11) because minus of total positive value starts from 0
		System.out.println(~b);//(9) positive of total minus starts from 0
		System.out.println(!c);//false
		System.out.println(!d);//true
	}
}