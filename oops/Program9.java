class demo1
{
	int n=89;
	static int c;
}
class Program9
{
	public static void main(String []args)
	{
		System.out.println(demo1().n);
		demo1.c=84;
		System.out.println(demo1.c);
	}
}