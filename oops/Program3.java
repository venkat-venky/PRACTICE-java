class sample
{
	static double b=9.8;
		public static void test(int c)
	{
		System.out.println("test method is printed");
	}
	static int a=5;
}
class Program3
{
	public static void main(String []args)
	{
		System.out.println("b="+sample.b);
		sample.test(34);
		System.out.println("a="+sample.a);
	}
}