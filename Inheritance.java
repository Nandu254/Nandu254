class A
 {
    int i;
    int j;
    A(int k, int l) 
	{
        i = k;
        j = l;
    }
    void m()
	{
        System.out.println("Hi");
    }
}
class B extends A 
{
    B(int k, int l)
	{
        super(k, l);
        System.out.println("Hello");
    }
}
class Inheritance 
{
    public static void main(String[] args) 
	{
        B b = new B(10, 20);   
        System.out.println(b.i);
        System.out.println(b.j);   
        b.m();
    }
}