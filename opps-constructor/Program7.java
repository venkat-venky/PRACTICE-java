class demo4
{
	static int a;
	demo4()
	{
		System.out.println("intialized value static");
		a=23456;
	}
}
class Program7
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		System.out.println("a="+new demo4().a);
		System.out.println("a="+new demo4().a);
		System.out.println("a="+new demo4().a);
		System.out.println("main method ended");
	}
}