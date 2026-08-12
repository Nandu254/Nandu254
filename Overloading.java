class A {
    int m(int k, int l)
	{
        return k + l;
    }
    
    float m(float m, float n) 
	{
        return m + n; 
    }
    
    int m(int k, int l, int p) 
	{
        return k + l + p;
    }
}

class Overloading 
{
    public static void main(String[] args) 
	{
        A a = new A();
        
        System.out.println(a.m(10, 20));       
        System.out.println(a.m(10.5f, 10.6f)); 
        System.out.println(a.m(10, 20, 30));   
    }
}