class A
{
		int i=10;
		int j=20;
	void m()
	{
		System.out.println("Hi");
	}
}
class B extends A
{
	void m()
	{
		int i=30;
		int j=40;
		System.out.println("Hello");
	}
}
class Overriding
{
	public static void main(String[]args)
	{
	 A a=new A();
	 B b=new B();
	 System.out.println(b.i);
	 System.out.println(a.j);
	}
}