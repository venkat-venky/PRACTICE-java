class demo1
{
	int cost;
	String paint;
	double yearsgurentye;

	demo1()
	{
	cost=220;
	paint="red colour";
	yearsgurentye=6.6;
	}
}
class Program5
{
	public static void main(String []args)
	{
		demo1 p=new demo1();
		System.out.println("cost="+new demo1().cost);
		System.out.println("paint="+new demo1().paint);
		System.out.println("yearsgurety"+new demo1().yearsgurentye);
	}
}