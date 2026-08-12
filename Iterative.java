class Iterative
{
	public static void main(String[]args)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		int[] a={10,20,30,40};
		int size =a.length;
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		for  (int x:a)
		System.out.println("x");
	}
}
		